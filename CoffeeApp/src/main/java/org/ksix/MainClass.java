package org.ksix;

import org.ksix.mygraphics.CategoryButton;
import org.ksix.mygraphics.MyInterface;

import javax.swing.*;
import java.awt.*;

public class MainClass {

    CategoryName current_category = CategoryName.COFFEE;

    public static void main(String[] args) {
        Uploader.uploadEverything();
        MyInterface my_interface = new MyInterface();
        my_interface.showWindow();

        /*JFrame window = new JFrame("test");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH);
        // window.setUndecorated(true);
        window.setLayout(new BorderLayout());
        window.add(new CategoryButton(CategoryName.COFFEE), BorderLayout.CENTER);
        window.pack();
        window.setVisible(true);*/
    }


}
