package org.ksix;

import org.ksix.mygraphics.MyInterface;

public class MainClass {

    CategoryStatus current_category = CategoryStatus.COFFEE;

    public static void main(String[] args) {
        Uploader.uploadEverything();
        MyInterface my_interface = new MyInterface();
        my_interface.showWindow();
    }


}
