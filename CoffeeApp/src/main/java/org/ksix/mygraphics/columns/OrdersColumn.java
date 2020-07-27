package org.ksix.mygraphics.columns;

import org.ksix.MainClass;
import org.ksix.mygraphics.MyInterface;
import org.ksix.orders.Order;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class OrdersColumn extends Column {

    //TODO  make scrollable (through JScrollPane?)

    private List<Order> orders;

    public OrdersColumn(List<Order> orders) {
        this.orders = orders;
        fillOrders();
    }

    private void fillOrders() {
        for (Order order : orders) {
            if (order.getStatus()) {
                JButton toAdd = new JButton(order.getName());
                toAdd.setBackground(MainClass.getRandomColor());
                toAdd.addMouseListener(new MouseAdapter() {
                    boolean pressed;

                    @Override
                    public void mousePressed(MouseEvent event) {
                        toAdd.getModel().setArmed(true);
                        toAdd.getModel().setPressed(true);
                        pressed = true;
                    }

                    @Override
                    public void mouseReleased(MouseEvent event) {
                        toAdd.getModel().setArmed(false);
                        toAdd.getModel().setPressed(false);
                        if (event.getClickCount() == 2) {
                            System.out.println();
                        }
                        if (pressed) {
                            if (SwingUtilities.isRightMouseButton(event)) {
                                switch (event.getClickCount()) {
                                    case 1:
                                        toAdd.setText("R");
                                        break;
                                    default:
                                        break;
                                }
                            } else {
                                switch (event.getClickCount()) {
                                    case 1:
                                        toAdd.setText("L");
                                        break;
                                    case 2:
                                        toAdd.setText(MyInterface.getNewName("Новое имя заказа:"));
                                        break;
                                    default:
                                        break;
                                }
                            }
                        }
                        pressed = false;
                    }

                    @Override
                    public void mouseExited(MouseEvent event) {
                        pressed = false;
                    }

                    @Override
                    public void mouseEntered(MouseEvent event) {
                        pressed = true;
                    }
                });
                this.add(toAdd);
            }
        }
    }


    public void update() {
        this.removeAll();
        fillOrders();
        this.revalidate();
        this.repaint();
    }
}
