package org.ksix.mygraphics;

import org.ksix.CategoryName;

import javax.swing.*;
import java.awt.*;

public class CategoryButton extends JButton {
    private static int MAX_WIDTH = 500;
    private static int MAX_HEIGHT = 1000;
    private final CategoryName associatedStatus;

    public CategoryButton(CategoryName associatedStatus, MyInterface myInterface) {
        super(associatedStatus.toString());
        this.associatedStatus = associatedStatus;
        setMaximumSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
        setBackground(Color.BLACK);
        setForeground(Color.LIGHT_GRAY);
        addActionListener(e -> {
            System.out.println("Button " + associatedStatus.toString() + " has been pressed: " + e.getActionCommand());
            myInterface.openMenu(associatedStatus);
        });
    }

}
