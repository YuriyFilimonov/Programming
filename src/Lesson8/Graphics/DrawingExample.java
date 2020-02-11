package Lesson8.Graphics;

import java.awt.*;

import javax.swing.JFrame;

public class DrawingExample extends JFrame {

    public DrawingExample() {
        super("Lines Drawing Demo");

        setSize(680, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        simpleDrawLines(g);
    }

    private void simpleDrawLines(Graphics g2d) {
//        Graphics2D g2d = (Graphics2D) g;

        g2d.drawLine(120, 50, 360, 50);

//        g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));
//
//        g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));

        g2d.setColor(Color.RED);
        g2d.drawRect(150, 150, 150, 150);

        g2d.setColor(Color.GREEN);
        g2d.fillRect(151, 151, 149, 75);


        g2d.drawOval(350, 150, 150, 150);
        g2d.setColor(Color.RED);
        g2d.fillOval(351, 151, 149, 149);
    }

    public static void main(String[] args) {
        new DrawingExample().setVisible(true);
    }
}