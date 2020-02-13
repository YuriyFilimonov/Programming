package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class FieldTicTacToe extends JFrame {
    final int CELLS = 9;
    final String X = "x";
    final String O = "0";
    Random random = new Random();
    ButtonX buttonX;
    ButtonO buttonO;
    JPanel jPanelButton, jPanelText;
    int zero, counter;

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

        JButton[] jb = new JButton[CELLS];
        jPanelButton.setLayout(new GridLayout(3, 3));
        for (int i = 0; i < jb.length; i++) {
            jb[i] = new JButton("•");
            jPanelButton.add(jb[i]);
        }

        JTextField jTextField = new JTextField();
        counterCells(jTextField);
//        setLayout(new BorderLayout());
        jPanelText.add(jTextField);
        setVisible(true);

//        Обработаем событие нажатие левой кнопкой мыши на кнопку
        for (JButton jButton : jb) {
            jButton.addActionListener(e -> {
                jButton.setText(X);
                counterCells(jTextField);
                buttonX = new ButtonX();
                jButton.add(buttonX);

                if (checkWin(jb, O)) {
                    jTextField.setText("AI Win");
                    return;
//                    System.exit(0); Приложение закрывается
                }
                else if (checkWin(jb, X)) {
                    jTextField.setText("Player Win");
                    return;
//                    System.exit(0); Приложение закрывается
                }

                if(++counter == 9){
                    jTextField.setText("Draw, cells ended.");
                    return;
                }

                while (true) {
                    zero = random.nextInt(jb.length);
                    if (!(jb[zero].getText().equals(X)) && !(jb[zero].getText().equals(O))) {
                        jb[zero].setText(O);
                        ++counter;
                        counterCells(jTextField);
                        buttonO = new ButtonO();
                        jb[zero].add(buttonO);
                        return;
                    }
                }
            });
        }
    }

    private void counterCells(JTextField jTextField) {
        jTextField.setText("Осталось " + (CELLS - counter) + " клеток");
    }

    private boolean checkWin(JButton[] jb, String s) {
        for (int i = 0; i < CELLS; i += 3) {
            if (jb[i].getText().equals(s) && jb[i + 1].getText().equals(s) && jb[i + 2].getText().equals(s)) {
                return true;
            }
        }
        for (int i = 0; i < CELLS / 3; i++) {
            if (jb[i].getText().equals(s) && jb[i + 3].getText().equals(s) && jb[i + 6].getText().equals(s)) {
                return true;
            }
        }
        return (jb[0].getText().equals(s) && jb[4].getText().equals(s) && jb[8].getText().equals(s)) ||
                (jb[2].getText().equals(s) && jb[4].getText().equals(s) && jb[6].getText().equals(s));
    }

    public static void main(String[] args) {

        new FieldTicTacToe();
    }
}
