package org.ksix;

import org.ksix.mygraphics.MyInterface;

public class MainClass {

    public static void main(String[] args) {
        Uploader.uploadEverything();
        MyInterface my_interface = new MyInterface();
        my_interface.showWindow();

    }

}
