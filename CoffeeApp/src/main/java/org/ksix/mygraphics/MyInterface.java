package org.ksix.mygraphics;

import javax.swing.*;

public class MyInterface implements Interface {
    private static final int windowSize = 1000;
    private final JFrame window = new JFrame("War Game");

    public MyInterface() {
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setSize(windowSize, windowSize);
        this.window.setLayout(null);
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }
}
