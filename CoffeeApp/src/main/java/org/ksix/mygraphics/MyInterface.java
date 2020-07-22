package org.ksix.mygraphics;

import org.ksix.CategoryName;
import org.ksix.MainClass;

import javax.swing.*;
import java.awt.*;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("Кофе   кофе   кофеёк");
    private final int STANDART_INDENTATION = 5;
    private Column categories_column;
    private MenuColumn menu_column;
    private Column orders_column;
    private Column control_panel_column;
    private SpringLayout external_layout;
    private CategoryName opened_menu = CategoryName.COFFEE;

    public MyInterface() {
        setUpWindow();
        createBasicFrames();
        addBasicColumns();
    }

    @Override
    public void setUpWindow() {
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        external_layout = new SpringLayout();
        window.setLayout(external_layout);
    }

    private void createBasicFrames() {
        categories_column = new Column();
        menu_column = new MenuColumn(CategoryName.values().length, MainClass.getNames(CategoryName.class));
        orders_column = new Column();
        control_panel_column = new Column();

        // TODO delete this
        categories_column.setBackground(Color.GREEN);
        // menu_column.setBackground(Color.YELLOW);
        orders_column.setBackground(Color.BLUE);
        control_panel_column.setBackground(Color.DARK_GRAY);
        //

        setUpColumns();
    }

    private void setUpColumns() {
        external_layout.putConstraint(SpringLayout.NORTH, categories_column, STANDART_INDENTATION, SpringLayout.NORTH, window.getContentPane());
        external_layout.putConstraint(SpringLayout.NORTH, menu_column, 0, SpringLayout.NORTH, categories_column);
        external_layout.putConstraint(SpringLayout.NORTH, orders_column, 0, SpringLayout.NORTH, menu_column);
        external_layout.putConstraint(SpringLayout.NORTH, control_panel_column, 0, SpringLayout.NORTH, orders_column);

        external_layout.putConstraint(SpringLayout.WEST, categories_column, STANDART_INDENTATION, SpringLayout.WEST, window.getContentPane());
        external_layout.putConstraint(SpringLayout.WEST, menu_column, STANDART_INDENTATION, SpringLayout.EAST, categories_column);
        external_layout.putConstraint(SpringLayout.WEST, orders_column, STANDART_INDENTATION, SpringLayout.EAST, menu_column);
        external_layout.putConstraint(SpringLayout.WEST, control_panel_column, STANDART_INDENTATION, SpringLayout.EAST, orders_column);
        external_layout.putConstraint(SpringLayout.EAST, window.getContentPane(), STANDART_INDENTATION, SpringLayout.EAST, control_panel_column);

        external_layout.putConstraint(SpringLayout.SOUTH, window.getContentPane(), STANDART_INDENTATION, SpringLayout.SOUTH, categories_column);
        external_layout.putConstraint(SpringLayout.SOUTH, menu_column, 0, SpringLayout.SOUTH, categories_column);
        external_layout.putConstraint(SpringLayout.SOUTH, orders_column, 0, SpringLayout.SOUTH, menu_column);
        external_layout.putConstraint(SpringLayout.SOUTH, control_panel_column, 0, SpringLayout.SOUTH, orders_column);

        fillCategories();

    }

    private void fillCategories() {
        for (CategoryName category :
                CategoryName.values()) {
            CategoryButton button = new CategoryButton(category, this);
            categories_column.add(button);
        }
    }

    private void addBasicColumns() {
        window.add(categories_column);
        window.add(menu_column);
        window.add(orders_column);
        window.add(control_panel_column);
    }

    @Override
    public void showWindow() {
        window.pack();
        window.setVisible(true);
    }

    public CategoryName getOpenedMenu() {
        return opened_menu;
    }

    public void openMenu(CategoryName opened_menu) {
        this.opened_menu = opened_menu;
        this.menu_column.showMenu(opened_menu.toString());
    }

}
