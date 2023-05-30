import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TwoPlayerGame {
  private static boolean turn = true;

  private static int[][] ox;

  private static JButton[][] btn;

  private static JFrame frm = new JFrame();

  public TwoPlayerGame(int num) {
    int i;
    frm.setDefaultCloseOperation(3);
    switch (num) {
      case 3:
        frm.setLayout(new GridLayout(3, 3));
        frm.setSize(500, 300);
        frm.setTitle("OX fight - Two Player 3*3");
        btn = new JButton[3][3];
        ox = new int[3][3];
        for (i = 0; i < 3; i++) {
          for (int o = 0; o < 3; o++) {
            ox[i][o] = 0;
            btn[i][o] = new JButton();
            frm.add(btn[i][o]);
            btn[i][o].addActionListener(new actionListener3(i, o));
          }
        }
        frm.setVisible(true);
        break;
    }
  }

  public static void press(int i, int o) {
    if (turn) {
      if (ox[i][o] == 0) {
        ox[i][o] = 1;
        btn[i][o].setText("O");
        turn = false;
        check(3);
      } else {
        JOptionPane.showMessageDialog(null, "You cannot place on that twice.", "Wrong", 2);
      }
    } else if (ox[i][o] == 0) {
      ox[i][o] = 2;
      btn[i][o].setText("X");
      turn = true;
      check(3);
    } else {
      JOptionPane.showMessageDialog(null, "You cannot place on that twice.", "Wrong", 2);
    }
  }

  private static void check(int n) {
    int a;
    boolean isFinish;
    switch (n) {
      case 3:
        if ((((ox[0][0] == ox[0][1]) ? 1 : 0) & ((ox[0][1] == ox[0][2]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][0]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[1][0] == ox[1][1]) ? 1 : 0) & ((ox[1][1] == ox[1][2]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[1][0]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[2][0] == ox[2][1]) ? 1 : 0) & ((ox[2][1] == ox[2][2]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[2][0]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[0][0] == ox[1][0]) ? 1 : 0) & ((ox[1][0] == ox[2][0]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][0]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[0][1] == ox[1][1]) ? 1 : 0) & ((ox[1][1] == ox[2][1]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][1]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[0][2] == ox[1][2]) ? 1 : 0) & ((ox[1][2] == ox[2][2]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][2]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[0][0] == ox[1][1]) ? 1 : 0) & ((ox[1][1] == ox[2][2]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][0]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        if ((((ox[0][2] == ox[1][1]) ? 1 : 0) & ((ox[1][1] == ox[2][0]) ? 1 : 0)) != 0) {
          int i;
          switch (ox[0][2]) {
            case 1:
              JOptionPane.showMessageDialog(null, "O win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
            case 2:
              JOptionPane.showMessageDialog(null, "X win !", "Game end", 1);
              for (i = 0; i < 3; i++) {
                for (int b = 0; b < 3; b++)
                  btn[i][b].setEnabled(false);
              }
              break;
          }
          break;
        }
        isFinish = true;
        for (a = 0; a < 3; a++) {
          for (int b = 0; b < 3; b++) {
            if (ox[a][b] == 0) {
              isFinish = false;
              break;
            }
          }
        }
        if (isFinish) {
          JOptionPane.showMessageDialog(null, "No one win this game.", "End", 1);
          for (a = 0; a < 3; a++) {
            for (int b = 0; b < 3; b++)
              btn[a][b].setEnabled(false);
          }
        }
        break;
    }
  }
}
