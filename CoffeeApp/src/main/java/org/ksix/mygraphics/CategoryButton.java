package org.ksix.mygraphics;

import org.ksix.CategoryName;

import javax.swing.*;
import java.awt.*;

public class CategoryButton extends JButton {
    private static int MAX_WIDTH = 500;
    private static int MAX_HEIGHT = 1000;
    CategoryName associated_status;

    public CategoryButton(CategoryName associated_status) {
        super(associated_status.toString());
        this.associated_status = associated_status;
        this.setMaximumSize(new Dimension(MAX_WIDTH, MAX_HEIGHT));
        this.setBorderPainted(true);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.LIGHT_GRAY);
    }


}
