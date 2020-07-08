package org.ksix.mygraphics;

import org.ksix.CategoryStatus;

import javax.swing.*;

public class CategoryButton extends JButton {
    CategoryStatus associated_status;

    public CategoryButton(CategoryStatus associated_status) {
        super(associated_status.toString());
        this.associated_status = associated_status;
    }


}
