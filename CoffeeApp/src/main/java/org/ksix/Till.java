package org.ksix;

import org.ksix.mygraphics.MyInterface;
import org.ksix.orders.Order;

import java.util.ArrayList;

public class Till {

    private ArrayList<Order> orders = new ArrayList<>();
    private MyInterface myInterface = new MyInterface(orders);


    public Till() {
        for (int i = 0; i < 30; ++i) {
            orders.add(new Order(i + 1));
        }
    }

    public void start() {
        myInterface.showWindow();
        myInterface.updateOrdersList();
    }

}
