package org.ksix.mygraphics;

import org.ksix.CategoryName;

import javax.swing.*;

public class CategoryButton extends JButton {
    CategoryName associated_status;

    public CategoryButton(CategoryName associated_status) {
        super(associated_status.toString());
        this.associated_status = associated_status;
    }


}
