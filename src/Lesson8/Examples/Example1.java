package Lesson8.Examples;

import javax.swing.*;

public class Example1 {

    static class MyWindow extends JFrame {
        public MyWindow() {
            setTitle("Test Window");
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setBounds(400, 300, 400, 400);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
        new MyWindow();
    }
}