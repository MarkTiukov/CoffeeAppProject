package org.ksix;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uploader {
    private static final String main_directory = "static/";
    private static final String menu_directory = main_directory + "menu/";
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
        scanFile(new File(menu_directory + "coffee_menu.txt"), coffee, true);
    }

    private static void uploadTeaMenu() {
        scanFile(new File(menu_directory + "tea_menu.txt"), coffee, true);

    }

    private static void uploadDessertMenu() {
        scanFile(new File(menu_directory + "dessert_menu.txt"), desserts, true);
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
        scanFile(new File(menu_directory + "syrup_menu.txt"), syrups, false);
    }

}
