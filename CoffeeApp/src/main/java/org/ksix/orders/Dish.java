package org.ksix.orders;

public class Dish {
    private final String name;
    private final int price;

    public Dish(String name, int price) {
        this.name = name.replace("_", " ");
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
