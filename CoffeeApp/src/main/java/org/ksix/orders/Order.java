package org.ksix.orders;

import java.util.ArrayList;

public class Order {

    private static final String DEFAULT_NAME = "ЗАКАЗ #";

    private String name;
    private int number;
    private int sum = 0;
    private boolean isOpened = true;
    private ArrayList<Dish> dishes = new ArrayList<>();

    public Order(int number) {
        this.number = number;
        this.name = DEFAULT_NAME + number;
    }

    public Order(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
        sum += dish.getPrice();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public boolean getStatus() {
        return isOpened;
    }
}
