package org.ksix.mygraphics.columns;

import org.ksix.CategoryName;
import org.ksix.MainClass;
import org.ksix.mygraphics.MenuCard;
import org.ksix.orders.Order;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuColumn extends Column {

    //TODO  make scrollable (through JScrollPane?)

    private JScrollPane scrollPane;

    public MenuColumn(List<CategoryName> cardNames, List<Order> orders) {
        super();
        this.setLayout(new CardLayout());
        for (CategoryName cardName : cardNames) {
            JPanel toAdd = new MenuCard(cardName, orders);
            toAdd.setBackground(MainClass.getRandomColor());
            this.add(toAdd, cardName.toString());
        }
        this.setPreferredSize(new Dimension(200, 1000));
    }

    public final void showMenu(String menuName) {
        CardLayout cl = (CardLayout) (this.getLayout());
        cl.show(this, menuName);
    }

}
