package org.ksix.mygraphics;

import javax.swing.*;
import java.awt.*;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("War Game");
    private final int STANDART_INDENTATION = 5;
    private Column categories_frame;
    private Column menu_frame;
    private Column orders_frame;
    private Column control_panel_frame;
    private SpringLayout external_layout;

    public MyInterface() {
        setUpWindow();
        createBasicFrames();
        addBasicColumns();
    }

    @Override
    public void setUpWindow() {
        // TODO test full-screen mode on Windows
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // window.setUndecorated(true);
        external_layout = new SpringLayout();
        window.setLayout(external_layout);
    }

    private void createBasicFrames() {
        //TODO replace for my own "Column"
        categories_frame = new Column();
        menu_frame = new Column();
        orders_frame = new Column();
        control_panel_frame = new Column();

        setUpColumns();

        // TODO delete this
        categories_frame.setBackground(Color.GREEN);

        menu_frame.setBackground(Color.YELLOW);

        orders_frame.setBackground(Color.BLUE);

        control_panel_frame.setBackground(Color.DARK_GRAY);

    }

    private void setUpColumns() {
        external_layout.putConstraint(SpringLayout.NORTH, categories_frame, STANDART_INDENTATION, SpringLayout.NORTH, window.getContentPane());
        external_layout.putConstraint(SpringLayout.NORTH, menu_frame, 0, SpringLayout.NORTH, categories_frame);
        external_layout.putConstraint(SpringLayout.NORTH, orders_frame, 0, SpringLayout.NORTH, menu_frame);
        external_layout.putConstraint(SpringLayout.NORTH, control_panel_frame, 0, SpringLayout.NORTH, orders_frame);

        external_layout.putConstraint(SpringLayout.WEST, categories_frame, STANDART_INDENTATION, SpringLayout.WEST, window.getContentPane());
        external_layout.putConstraint(SpringLayout.WEST, menu_frame, STANDART_INDENTATION, SpringLayout.EAST, categories_frame);
        external_layout.putConstraint(SpringLayout.WEST, orders_frame, STANDART_INDENTATION, SpringLayout.EAST, menu_frame);
        external_layout.putConstraint(SpringLayout.WEST, control_panel_frame, STANDART_INDENTATION, SpringLayout.EAST, orders_frame);
        external_layout.putConstraint(SpringLayout.EAST, window.getContentPane(), STANDART_INDENTATION, SpringLayout.EAST, control_panel_frame);

        external_layout.putConstraint(SpringLayout.SOUTH, window.getContentPane(), STANDART_INDENTATION, SpringLayout.SOUTH, categories_frame);
        external_layout.putConstraint(SpringLayout.SOUTH, menu_frame, 0, SpringLayout.SOUTH, categories_frame);
        external_layout.putConstraint(SpringLayout.SOUTH, orders_frame, 0, SpringLayout.SOUTH, menu_frame);
        external_layout.putConstraint(SpringLayout.SOUTH, control_panel_frame, 0, SpringLayout.SOUTH, orders_frame);

    }

    private void fillCategories() {
        // TODO make fillCategories()
    }

    private void addBasicColumns() {
        window.add(categories_frame);
        window.add(menu_frame);
        window.add(orders_frame);
        window.add(control_panel_frame);
    }

    @Override
    public void showWindow() {
        window.pack();
        window.setVisible(true);
    }

}
