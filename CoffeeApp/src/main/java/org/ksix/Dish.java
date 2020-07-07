package org.ksix;

public class Dish {
    private String name;
    private int price;

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
