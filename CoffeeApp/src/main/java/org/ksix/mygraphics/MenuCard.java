package org.ksix.mygraphics;

import org.ksix.CategoryName;
import org.ksix.Uploader;
import org.ksix.orders.Dish;
import org.ksix.orders.Order;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MenuCard extends JPanel {

    private CategoryName category;
    private ArrayList<Dish> menuData;
    private List<Order> orders;

    public MenuCard(CategoryName category, List<Order> orders) {
        this.category = category;
        this.orders = orders;

        menuData = Uploader.getData(category);
        this.fillWithButtons();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    private void fillWithButtons() {
        for (Dish menuPoint : menuData) {
            JButton button = new JButton(menuPoint.getName());
            button.addActionListener((event) -> {
                System.out.println("Chose " + menuPoint.getName() + " with price == " + menuPoint.getPrice());
                orders.get(orders.size() - 1).addDish(menuPoint);
            });
            this.add(button);
        }
    }

}
