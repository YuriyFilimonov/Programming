package Lesson8.Events;

import javax.swing.*;
import java.awt.event.*;

public class KeyboardExample {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500, 500, 400, 300);
            setTitle("Demo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JTextField field = new JTextField();
            add(field);
            field.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Your message: " + field.getText());
                    field.setText(null);
                }
            });

            field.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if (e.isShiftDown()) {
                        System.out.println("Shift down");
                    } else {
                        System.out.println(e.getKeyChar() + " down");
                    }
                }
            });

            setVisible(true);
        }

    }


    public static void main(String[] args) {
        new MyWindow();
    }
}