package org.ksix.mygraphics;

import org.ksix.CategoryName;
import org.ksix.mygraphics.columns.Column;
import org.ksix.mygraphics.columns.MenuColumn;
import org.ksix.mygraphics.columns.OrdersColumn;
import org.ksix.orders.Order;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("Кофе   кофе   кофеёк");
    private final int STANDART_INDENTATION = 5;
    private Column categoriesColumn;
    private MenuColumn menuColumn;
    private OrdersColumn ordersColumn;
    private Column controlPanelColumn;
    private SpringLayout externalLayout;
    private ArrayList<Order> orders;

    public MyInterface(ArrayList<Order> orders) {
        this.orders = orders;
        setUpWindow();
        createBasicFrames();
        addBasicColumns();
    }

    @Override
    public void setUpWindow() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        externalLayout = new SpringLayout();
        window.setLayout(externalLayout);
    }

    private void createBasicFrames() {
        categoriesColumn = new Column();
        menuColumn = new MenuColumn(Arrays.asList(CategoryName.values()), orders);
        ordersColumn = new OrdersColumn(orders);
        controlPanelColumn = new Column();

        // TODO delete this
        categoriesColumn.setBackground(Color.GREEN);
        // menuColumn.setBackground(Color.YELLOW);
        ordersColumn.setBackground(Color.BLUE);
        controlPanelColumn.setBackground(Color.DARK_GRAY);
        //

        setUpColumns();
    }

    private void setUpColumns() {
        externalLayout.putConstraint(SpringLayout.NORTH, categoriesColumn, STANDART_INDENTATION, SpringLayout.NORTH, window.getContentPane());
        externalLayout.putConstraint(SpringLayout.NORTH, menuColumn, 0, SpringLayout.NORTH, categoriesColumn);
        externalLayout.putConstraint(SpringLayout.NORTH, ordersColumn, 0, SpringLayout.NORTH, menuColumn);
        externalLayout.putConstraint(SpringLayout.NORTH, controlPanelColumn, 0, SpringLayout.NORTH, ordersColumn);

        externalLayout.putConstraint(SpringLayout.WEST, categoriesColumn, STANDART_INDENTATION, SpringLayout.WEST, window.getContentPane());
        externalLayout.putConstraint(SpringLayout.WEST, menuColumn, STANDART_INDENTATION, SpringLayout.EAST, categoriesColumn);
        externalLayout.putConstraint(SpringLayout.WEST, ordersColumn, STANDART_INDENTATION, SpringLayout.EAST, menuColumn);
        externalLayout.putConstraint(SpringLayout.WEST, controlPanelColumn, STANDART_INDENTATION, SpringLayout.EAST, ordersColumn);
        externalLayout.putConstraint(SpringLayout.EAST, window.getContentPane(), STANDART_INDENTATION, SpringLayout.EAST, controlPanelColumn);

        externalLayout.putConstraint(SpringLayout.SOUTH, window.getContentPane(), STANDART_INDENTATION, SpringLayout.SOUTH, categoriesColumn);
        externalLayout.putConstraint(SpringLayout.SOUTH, menuColumn, 0, SpringLayout.SOUTH, categoriesColumn);
        externalLayout.putConstraint(SpringLayout.SOUTH, ordersColumn, 0, SpringLayout.SOUTH, menuColumn);
        externalLayout.putConstraint(SpringLayout.SOUTH, controlPanelColumn, 0, SpringLayout.SOUTH, ordersColumn);

        categoriesColumn.setPreferredSize(new Dimension(400, 1)); // TODO delete this;
        fillCategories();
        fillOrders();

    }

    private void fillCategories() {
        for (CategoryName category :
                CategoryName.values()) {
            CategoryButton button = new CategoryButton(category, this);
            categoriesColumn.add(button);
        }
    }

    private void fillOrders() {
        for (Order order : orders) {
            System.out.println("here");
            ordersColumn.add(new JLabel(order.getName()));
        }
        System.out.println("size == " + orders.size());
    }

    private void addBasicColumns() {
        window.add(categoriesColumn);
        window.add(menuColumn);
        window.add(ordersColumn);
        window.add(controlPanelColumn);
    }

    @Override
    public void showWindow() {
        window.pack();
        window.setVisible(true);
    }

    public void openMenu(CategoryName openedMenu) {
        this.menuColumn.showMenu(openedMenu.toString());
    }

    public void updateOrdersList() {
        ordersColumn.update();
    }

}
