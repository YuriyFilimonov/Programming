package Lesson8.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayout4 {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500,500,400,300);
            setTitle("GridLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton[] jbs = new JButton[10];
            setLayout(new GridLayout(4, 3));
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                add(jbs[i]);
            }
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}