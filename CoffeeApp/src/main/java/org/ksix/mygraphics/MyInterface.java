package org.ksix.mygraphics;

import javax.swing.*;
import java.awt.*;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("War Game");
    private JPanel categories_frame;
    private JPanel menu_frame;
    private JPanel orders_frame;
    private JPanel control_panel_frame;
    private SpringLayout external_layout;

    public MyInterface() {
        this.setUpWindow();
        this.createBasicFrames();
    }

    @Override
    public void setUpWindow() {
        // TODO test full-screen mode on Windows
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // this.window.setUndecorated(true);
        this.external_layout = new SpringLayout();
        this.window.setLayout(this.external_layout);

        /// delete
        JPanel a = new JPanel();
        a.setSize(1000, 2000);
        a.setBackground(Color.BLUE);
        this.external_layout.putConstraint(SpringLayout.WEST, a, 5, SpringLayout.WEST, this.window.getContentPane());
        JPanel b = new JPanel();
        b.setSize(1000, 2000);
        b.setBackground(Color.YELLOW);
        this.external_layout.putConstraint(SpringLayout.WEST, b, 5, SpringLayout.EAST, a);
        JPanel c = new JPanel();
        c.setSize(1000, 2000);
        c.setBackground(Color.CYAN);
        this.external_layout.putConstraint(SpringLayout.WEST, c, 5, SpringLayout.EAST, b);
        this.window.add(a);
        this.window.add(b);
        this.window.add(c);
        this.window.pack();
    }

    @Override
    public void createBasicFrames() {
        this.categories_frame = new JPanel();
        this.menu_frame = new JPanel();
        this.orders_frame = new JPanel();
        this.control_panel_frame = new JPanel();
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }
}
