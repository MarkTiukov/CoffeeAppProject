package org.ksix.mygraphics;

import org.ksix.CategoryName;

import javax.swing.*;
import java.awt.*;

public class CategoryButton extends JButton {
    private static int MAX_WIDTH = 500;
    private static int MAX_HEIGHT = 1000;
    private final CategoryName associated_status;

    public CategoryButton(CategoryName associated_status, MyInterface my_interface) {
        super(associated_status.toString());
        this.associated_status = associated_status;
        setMaximumSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
        setBackground(Color.BLACK);
        setForeground(Color.LIGHT_GRAY);
        addActionListener(e -> {
            System.out.println("Button " + associated_status.toString() + " has been pressed: " + e.getActionCommand());
            my_interface.openMenu(associated_status);
        });
    }

}
