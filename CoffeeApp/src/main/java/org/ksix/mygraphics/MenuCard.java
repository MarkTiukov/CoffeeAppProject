package org.ksix.mygraphics;

import org.ksix.CategoryName;
import org.ksix.Uploader;
import org.ksix.orders.Dish;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuCard extends JPanel {

    private CategoryName category;
    private ArrayList<Dish> menuData;

    public MenuCard(CategoryName category) {
        this.category = category;
        menuData = Uploader.getData(category);
        this.fillWithButtons();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void fillWithButtons() {
        for (Dish menuPoint : menuData) {
            this.add(new Button(menuPoint.getName()));
        }
    }

}
