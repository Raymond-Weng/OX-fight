import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SingleGame {
  private static boolean turn = true;

  private static int[][] ox;

  private static JButton[][] btn;

  private static JFrame frm = new JFrame();

  public SingleGame(int num) {
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
            btn[i][o].addActionListener(new actionListener2(i, o, 3));
          }
        }
        frm.setVisible(true);
        break;
    }
  }

  public static boolean press(int i, int o, int length) {
    switch (length) {
      case 3:
        if (turn) {
          if (ox[i][o] == 0) {
            ox[i][o] = 1;
            btn[i][o].setText("O");
            turn = false;
            check(3);
            break;
          }
          JOptionPane.showMessageDialog(null, "You cannot place on that twice.", "Wrong", 2);
          break;
        }
        if (ox[i][o] == 0) {
          ox[i][o] = 2;
          btn[i][o].setText("X");
          turn = true;
          check(3);
          break;
        }
        JOptionPane.showMessageDialog(null, "You cannot place on that twice.", "Wrong", 2);
        break;
    }
    return btn[0][0].isEnabled();
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

  public static void com(int length) {
    int[] xy = { -1, -1 };
    boolean isntDo = true;
    switch (length) {
      case 3:
        if ((((ox[0][0] == ox[0][1]) ? 1 : 0) & ((ox[0][2] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 0;
              xy[1] = 2;
              break;
            case 2:
              if (isntDo) {
                press(0, 2, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][0] == ox[0][2]) ? 1 : 0) & ((ox[0][1] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 0;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(0, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][1] == ox[0][2]) ? 1 : 0) & ((ox[0][0] == 0) ? 1 : 0)) != 0)
          switch (ox[0][1]) {
            case 1:
              xy[0] = 0;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(0, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[1][0] == ox[1][1]) ? 1 : 0) & ((ox[1][2] == 0) ? 1 : 0)) != 0)
          switch (ox[1][0]) {
            case 1:
              xy[0] = 1;
              xy[1] = 2;
              break;
            case 2:
              if (isntDo) {
                press(1, 2, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[1][0] == ox[1][2]) ? 1 : 0) & ((ox[1][1] == 0) ? 1 : 0)) != 0)
          switch (ox[1][0]) {
            case 1:
              xy[0] = 1;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(1, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[1][1] == ox[1][2]) ? 1 : 0) & ((ox[1][0] == 0) ? 1 : 0)) != 0)
          switch (ox[1][1]) {
            case 1:
              xy[0] = 1;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(1, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][0] == ox[2][1]) ? 1 : 0) & ((ox[2][2] == 0) ? 1 : 0)) != 0)
          switch (ox[2][0]) {
            case 1:
              xy[0] = 2;
              xy[1] = 2;
              break;
            case 2:
              if (isntDo) {
                press(2, 2, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][0] == ox[2][2]) ? 1 : 0) & ((ox[2][1] == 0) ? 1 : 0)) != 0)
          switch (ox[2][0]) {
            case 1:
              xy[0] = 2;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(2, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][1] == ox[2][2]) ? 1 : 0) & ((ox[2][0] == 0) ? 1 : 0)) != 0)
          switch (ox[2][1]) {
            case 1:
              xy[0] = 2;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(2, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][0] == ox[1][0]) ? 1 : 0) & ((ox[2][0] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 2;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(2, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][0] == ox[2][0]) ? 1 : 0) & ((ox[1][0] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 1;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(1, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][0] == ox[1][0]) ? 1 : 0) & ((ox[0][0] == 0) ? 1 : 0)) != 0)
          switch (ox[2][0]) {
            case 1:
              xy[0] = 0;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(0, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][1] == ox[1][1]) ? 1 : 0) & ((ox[2][1] == 0) ? 1 : 0)) != 0)
          switch (ox[0][1]) {
            case 1:
              xy[0] = 2;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(2, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][1] == ox[2][1]) ? 1 : 0) & ((ox[1][1] == 0) ? 1 : 0)) != 0)
          switch (ox[0][1]) {
            case 1:
              xy[0] = 1;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(1, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][1] == ox[1][1]) ? 1 : 0) & ((ox[0][1] == 0) ? 1 : 0)) != 0)
          switch (ox[2][0]) {
            case 1:
              xy[0] = 0;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(0, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][0] == ox[1][1]) ? 1 : 0) & ((ox[2][2] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 2;
              xy[1] = 2;
              break;
            case 2:
              if (isntDo) {
                press(2, 2, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][0] == ox[2][2]) ? 1 : 0) & ((ox[1][1] == 0) ? 1 : 0)) != 0)
          switch (ox[0][0]) {
            case 1:
              xy[0] = 1;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(1, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][2] == ox[1][1]) ? 1 : 0) & ((ox[0][0] == 0) ? 1 : 0)) != 0)
          switch (ox[2][2]) {
            case 1:
              xy[0] = 0;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(0, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][2] == ox[1][1]) ? 1 : 0) & ((ox[2][0] == 0) ? 1 : 0)) != 0)
          switch (ox[0][2]) {
            case 1:
              xy[0] = 2;
              xy[1] = 0;
              break;
            case 2:
              if (isntDo) {
                press(2, 0, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[0][2] == ox[2][0]) ? 1 : 0) & ((ox[1][1] == 0) ? 1 : 0)) != 0)
          switch (ox[0][2]) {
            case 1:
              xy[0] = 1;
              xy[1] = 1;
              break;
            case 2:
              if (isntDo) {
                press(1, 1, 3);
                isntDo = false;
              }
              break;
          }
        if ((((ox[2][0] == ox[1][1]) ? 1 : 0) & ((ox[0][2] == 0) ? 1 : 0)) != 0)
          switch (ox[2][0]) {
            case 1:
              xy[0] = 0;
              xy[1] = 2;
              break;
            case 2:
              if (isntDo) {
                press(0, 2, 3);
                isntDo = false;
              }
              break;
          }
        if (isntDo) {
          if (xy[1] == -1) {
            for (int a = 0; a < 3; a++) {
              for (int b = 0;; b++) {
                if (ox[a][b] == 0) {
                  press(a, b, 3);
                  isntDo = false;
                  break;
                }
              }
              if (!isntDo)
                break;
            }
            if (isntDo)
              JOptionPane.showMessageDialog(null, "uhh...something wrong", "", 2);
            break;
          }
          press(xy[0], xy[1], 3);
        }
        break;
    }
  }
}
