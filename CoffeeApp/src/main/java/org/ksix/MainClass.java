package org.ksix;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainClass {

    public static void main(String[] args) {
        Uploader.uploadEverything();
        Till till = new Till();
        till.start();
    }

    public static Color getRandomColor() {
        //TODO delete this
        Color[] colors = {Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.GRAY, Color.YELLOW, Color.MAGENTA, Color.PINK, Color.ORANGE};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }

    public static List<String> getNames(Class<? extends Enum<?>> e) {
        return Arrays.asList(Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new));
    }

}
