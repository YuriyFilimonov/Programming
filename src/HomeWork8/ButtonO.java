package HomeWork8;

import javax.swing.*;
import java.awt.*;

class ButtonO extends JPanel {
    ButtonO(){}
    protected void paintComponent(Graphics graphics) {
        super.paintComponents(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.RED);
        g2d.drawOval(0, this.getHeight() / 8, getWidth(), getWidth());
    }
}
