package org.ksix.mygraphics;

import org.ksix.CategoryName;
import org.ksix.MainClass;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MenuColumn extends Column {

    public MenuColumn(int numberOfCards, List<CategoryName> cardNames) {
        super();
        this.setLayout(new CardLayout());
        for (CategoryName cardName : cardNames) {
            /*JPanel toAdd = new Column();
            toAdd.setBackground(MainClass.getRandomColor());      //TODO delete this;
            for (int i = 0; i < 15; ++i) {                        //
                toAdd.add(new JLabel(MainClass.getRandomWord())); //
            }                                                     //
            */

            JPanel toAdd = new MenuCard(cardName);
            toAdd.setBackground(MainClass.getRandomColor());
            this.add(toAdd, cardName.toString());
        }
        this.setPreferredSize(new Dimension(200, 1000));
    }

    public final void showMenu(String menuName) {
        CardLayout cl = (CardLayout) (this.getLayout());
        cl.show(this, menuName);
    }

}
