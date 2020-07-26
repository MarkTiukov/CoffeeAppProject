package org.ksix.mygraphics.columns;

import org.ksix.MainClass;
import org.ksix.orders.Order;

import javax.swing.*;
import java.util.List;

public class OrdersColumn extends Column {

    //TODO  make scrollable (through JScrollPane?)

    private List<Order> orders;

    public OrdersColumn(List<Order> orders) {
        this.orders = orders;
        fillOrders();
    }

    private void fillOrders() {
        for (Order order : orders) {
            if (order.getStatus()) {
                JButton toAdd = new JButton(order.getName());
                toAdd.setBackground(MainClass.getRandomColor());
                this.add(toAdd);
            }
        }
    }

    public void update() {
        this.removeAll();
        fillOrders();
        this.revalidate();
        this.repaint();
    }
}
