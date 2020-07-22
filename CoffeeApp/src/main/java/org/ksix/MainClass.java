package org.ksix;

import org.ksix.mygraphics.MyInterface;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainClass {

    CategoryName current_category = CategoryName.COFFEE;

    public static void main(String[] args) {
        Uploader.uploadEverything();
        MyInterface my_interface = new MyInterface();
        my_interface.showWindow();

    }

    public static Color getRandomColor() {
        //TODO delete this
        Color[] colors = {Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.GRAY, Color.YELLOW, Color.MAGENTA, Color.PINK, Color.ORANGE};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

    public static String getRandomWord() {
        //TODO delete this
        ArrayList<String> words = new ArrayList<>();
        words.add("department");
        words.add("reaction");
        words.add("grandmother");
        words.add("fishing");
        words.add("injury");
        words.add("vehicle");
        words.add("distribution");
        words.add("membership");
        words.add("basis");
        words.add("cookie");
        words.add("funeral");
        words.add("priority");
        words.add("efficiency");
        words.add("guest");
        words.add("preference");
        words.add("bird");
        words.add("investment");
        words.add("piano");
        words.add("country");
        words.add("application");
        Random random = new Random();
        return words.get(random.nextInt(words.size()));
    }

    public static List<String> getNames(Class<? extends Enum<?>> e) {
        return Arrays.asList(Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new));
    }

}
