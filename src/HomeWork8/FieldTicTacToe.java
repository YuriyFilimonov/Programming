package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FieldTicTacToe extends JFrame {
    Random random = new Random();
    ButtonX buttonX;
    ButtonO buttonO;
    JPanel jPanelButton, jPanelText;
    int zero;

    public FieldTicTacToe() {

        setLocationByPlatform(true);
        setSize(300, 300);

        setLocationRelativeTo(null);
        setTitle("TicTacToe");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanelButton = new JPanel();
        jPanelText = new JPanel();
        setLayout(new BorderLayout());
        add(jPanelButton, BorderLayout.CENTER);
        add(jPanelText, BorderLayout.SOUTH);

        JButton[] jb = new JButton[9];
        jPanelButton.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < jb.length; i++) {
            jb[i] = new JButton("•");
            jPanelButton.add(jb[i]);
        }

        JTextField jTextField = new JTextField("Turn of Player");
//        setLayout(new BorderLayout());
        jPanelText.add(jTextField);
        setVisible(true);

//        Обработаем событие нажатие левой кнопкой мыши на кнопку
        for (JButton jButton : jb) {
            jButton.addActionListener(e -> {
                jButton.setText(null);
                buttonX = new ButtonX();
                jButton.add(buttonX);
                try {
                    while (true) {
                        zero = random.nextInt(jb.length);
                        if (jb[zero].getText().equals("•")){
                            jb[zero].setText(null);
                            buttonO = new ButtonO();
                            jb[zero].add(buttonO);
                            return ;
                        }
                    }
                } catch (NullPointerException e1) {
                    System.out.println("Ошибка");
                }
           });
        }
    }

    public static void main(String[] args) {

        new FieldTicTacToe();
    }
}
