package org.ksix.mygraphics;

import javax.swing.*;
import java.awt.*;

public class Column extends JPanel {

    private static final int PREFERRED_WIDTH = 100000;
    private static final int PREFERRED_HEIGHT = 1;


    public Column() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//        this.add(new JLabel("constructor ")); //TODO delete this
        this.setPreferredSize(new Dimension(PREFERRED_WIDTH, PREFERRED_HEIGHT));
    }

}
