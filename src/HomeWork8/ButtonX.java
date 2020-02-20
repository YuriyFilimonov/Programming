package HomeWork8;

import javax.swing.*;
import java.awt.*;

class ButtonX extends JPanel {
    ButtonX(){}
    protected void paintComponent(Graphics graphics) {
        super.paintComponents(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setStroke(new BasicStroke(10));
        g2d.setColor(Color.BLUE);
        g2d.drawLine(0, 0, this.getWidth(), this.getHeight());
        g2d.drawLine(this.getWidth(), 0,  0, this.getHeight());
    }
}
