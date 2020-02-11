package Lesson8.BorderLayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayout2 {

    static public class MyWindow extends JFrame {
        public MyWindow() {
            setBounds(500,500,500,300);
            setTitle("BoxLayoutDemo");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JButton[] jbs = new JButton[10];
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); // одну из строк надо закомментировать
//            setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS)); // одну из строк надо закомментировать
            for (int i = 0; i < jbs.length; i++) {
                jbs[i] = new JButton("#" + i);
                jbs[i].setAlignmentX(LEFT_ALIGNMENT);
                add(jbs[i]);
            }
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}