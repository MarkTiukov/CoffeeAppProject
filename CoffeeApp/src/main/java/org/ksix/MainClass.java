package org.ksix;

import org.ksix.mygraphics.Column;

import javax.swing.*;
import java.awt.*;

public class MainClass {

    CategoryStatus current_category = CategoryStatus.COFFEE;

    public static void main(String[] args) {
        /*Uploader.uploadEverything();
        MyInterface my_interface = new MyInterface();
        my_interface.showWindow();*/


        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        SpringLayout external_layout = new SpringLayout();
        window.setLayout(external_layout);

        Column panel = new Column();
        panel.setBackground(Color.RED);
        window.add(panel);
        window.pack();
        window.setVisible(true);

    }


}
