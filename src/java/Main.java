import javax.swing.*;
import java.awt.*;

public class Main {
    private static JFrame frm = new JFrame();

    private static JLabel title = new JLabel("OX fight", 0);

    private static JButton single = new JButton();

    private static JButton twoPlayer = new JButton();

    public static void main(String[] args) {
        frm.setTitle("OX fight");
        frm.setLayout(new GridLayout(3, 1));
        frm.setDefaultCloseOperation(3);
        frm.add(title);
        frm.add(single);
        frm.add(twoPlayer);
        frm.setSize(300, 250);
        single.setText("Player vs Computer");
        twoPlayer.setText("Player Vs Player");
        single.addActionListener(e -> {
            Single sin = new Single();
            frm.setVisible(false);
        });
        twoPlayer.addActionListener(e -> {
            TwoPlayer twoP = new TwoPlayer();
            frm.setVisible(false);
        });
        frm.setVisible(true);
    }
}
