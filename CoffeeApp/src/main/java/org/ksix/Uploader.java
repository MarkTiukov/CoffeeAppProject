package org.ksix;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uploader {
    private static final String mainDirectory = "static/";
    private static final String menuDirectory = mainDirectory + "menu/";
    public static ArrayList<Dish> coffee = new ArrayList<>();
    public static ArrayList<Dish> tea = new ArrayList<>();
    public static ArrayList<Dish> desserts = new ArrayList<>();
    public static ArrayList<Dish> syrups = new ArrayList<>();

    public static void uploadEverything() {
        uploadCoffeeMenu();
        uploadTeaMenu();
        uploadDessertMenu();
        uploadSyrupMenu();
    }

    private static void uploadCoffeeMenu() {
        scanFile(new File(menuDirectory + "coffee_menu.txt"), coffee, true);
    }

    private static void uploadTeaMenu() {
        scanFile(new File(menuDirectory + "tea_menu.txt"), coffee, true);

    }

    private static void uploadDessertMenu() {
        scanFile(new File(menuDirectory + "dessert_menu.txt"), desserts, true);
    }

    private static void scanFile(File current_file, ArrayList<Dish> array, boolean hasPrice) {
        try (Scanner scanner = new Scanner(current_file)) {
            while (scanner.hasNextLine()) {
                String current = scanner.nextLine();
                array.add(new Dish(current.split(" ")[0], hasPrice ? Integer.parseInt(current.split(" ")[1]) : 0));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uploadSyrupMenu() {
        scanFile(new File(menuDirectory + "syrup_menu.txt"), syrups, false);
    }

}
