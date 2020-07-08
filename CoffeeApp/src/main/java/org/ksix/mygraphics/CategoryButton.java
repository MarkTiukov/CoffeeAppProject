package org.ksix.mygraphics;

import org.ksix.CategoryStatus;

import javax.swing.*;

public class CategoryButton extends JButton {
    CategoryStatus associated_status;

    public CategoryButton(String text, CategoryStatus associated_status) {
        //TODO here
        super(text);
        this.associated_status = associated_status;
    }


}
