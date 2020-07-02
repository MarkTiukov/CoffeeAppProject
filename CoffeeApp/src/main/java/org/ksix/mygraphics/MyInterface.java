package org.ksix.mygraphics;

import javax.swing.*;

public class MyInterface implements Interface {
    private final JFrame window = new JFrame("War Game");

    public MyInterface() {
        // TODO test full-screen mode on Windows
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // this.window.setUndecorated(true);
        this.window.setLayout(null);
    }

    @Override
    public void showWindow() {
        this.window.setVisible(true);
    }
}
