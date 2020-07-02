package org.ksix;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uploader {
    private static final String main_directory = "static/";
    private static final String menu_directory = main_directory + "menu/";
    public static ArrayList<String> coffee = new ArrayList<>();
    public static ArrayList<String> tea = new ArrayList<>();
    public static ArrayList<String> desserts = new ArrayList<>();
    public static ArrayList<String> syrups = new ArrayList<>();

    public static void uploadEverything() {
        uploadCoffeeMenu();
        uploadTeaMenu();
        uploadDessertMenu();
        uploadSyrupMenu();
    }

    private static void uploadCoffeeMenu() {
        File current_file = new File(menu_directory + "coffee_menu.txt");
        try (Scanner scanner = new Scanner(current_file)) {
            while (scanner.hasNextLine()) {
                coffee.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uploadTeaMenu() {
        File current_file = new File(menu_directory + "tea_menu.txt");
        try (Scanner scanner = new Scanner(current_file)) {
            while (scanner.hasNextLine()) {
                tea.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uploadDessertMenu() {
        File current_file = new File(menu_directory + "dessert_menu.txt");
        try (Scanner scanner = new Scanner(current_file)) {
            while (scanner.hasNextLine()) {
                desserts.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void uploadSyrupMenu() {
        File current_file = new File(menu_directory + "syrup_menu.txt");
        try (Scanner scanner = new Scanner(current_file)) {
            while (scanner.hasNextLine()) {
                syrups.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
