package org.ksix.mygraphics;

import javax.swing.*;
import java.awt.*;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("War Game");
    private final int STANDART_INDENTATION = 5;
    private JPanel categories_frame;
    private JPanel menu_frame;
    private JPanel orders_frame;
    private JPanel control_panel_frame;
    private SpringLayout external_layout;

    public MyInterface() {
        setUpWindow();
        createBasicFrames();
        addBasicFrames();
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

    public void example() {
        // can be deleted
        JPanel a = new JPanel();
        a.setBackground(Color.BLUE);
        external_layout.putConstraint(SpringLayout.WEST, a, 5, SpringLayout.WEST, window.getContentPane());
        external_layout.putConstraint(SpringLayout.NORTH, a, 10, SpringLayout.NORTH, window.getContentPane());
        external_layout.putConstraint(SpringLayout.SOUTH, window.getContentPane(), 10, SpringLayout.SOUTH, a);

        JPanel b = new JPanel();
        b.setBackground(Color.YELLOW);
        external_layout.putConstraint(SpringLayout.WEST, b, 5, SpringLayout.EAST, a);
        external_layout.putConstraint(SpringLayout.NORTH, b, 0, SpringLayout.NORTH, a);
        external_layout.putConstraint(SpringLayout.SOUTH, b, 0, SpringLayout.SOUTH, a);

        JPanel c = new JPanel();
        c.setBackground(Color.CYAN);
        external_layout.putConstraint(SpringLayout.WEST, c, 5, SpringLayout.EAST, b);
        external_layout.putConstraint(SpringLayout.EAST, window.getContentPane(), 5, SpringLayout.EAST, c);
        external_layout.putConstraint(SpringLayout.NORTH, c, 0, SpringLayout.NORTH, b);
        external_layout.putConstraint(SpringLayout.SOUTH, c, 0, SpringLayout.SOUTH, b);

        window.add(a);
        window.add(b);
        window.add(c);
    }

    private void createBasicFrames() {
        categories_frame = new JPanel();
        menu_frame = new JPanel();
        orders_frame = new JPanel();
        control_panel_frame = new JPanel();

        setUpFrames();

        // TODO delete this
        categories_frame.setBackground(Color.RED);
        menu_frame.setBackground(Color.YELLOW);
        orders_frame.setBackground(Color.BLUE);
        control_panel_frame.setBackground(Color.DARK_GRAY);
    }

    private void setUpFrames() {
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

    private void addBasicFrames() {
        window.add(categories_frame);
        window.add(menu_frame);
        window.add(orders_frame);
        window.add(control_panel_frame);
    }

    @Override
    public void showWindow() {
        window.setVisible(true);
    }
}
