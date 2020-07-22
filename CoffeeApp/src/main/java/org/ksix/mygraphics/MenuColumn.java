package org.ksix.mygraphics;

import org.ksix.MainClass;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuColumn extends Column {

    public MenuColumn(int numberOfCards, List<String> cardNames) {
        super();
        this.setLayout(new CardLayout());
        for (String cardName : cardNames) {
            JPanel toAdd = new Column();
            toAdd.setBackground(MainClass.getRandomColor());      //TODO delete this;
            for (int i = 0; i < 15; ++i) {                        //
                toAdd.add(new JLabel(MainClass.getRandomWord())); //
            }                                                     //
            this.add(toAdd, cardName);
        }
    }

    public final void showMenu(String menuName) {
        CardLayout cl = (CardLayout) (this.getLayout());
        cl.show(this, menuName);
    }

}
