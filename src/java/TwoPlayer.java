import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TwoPlayer {
  private static JFrame frm = new JFrame();

  private static JButton three = new JButton();

  private static JButton four = new JButton();

  public TwoPlayer() {
    frm.setTitle("Choose mode");
    frm.setSize(300, 150);
    frm.setLayout(new GridLayout(2, 1));
    frm.setDefaultCloseOperation(3);
    frm.add(three);
    frm.add(four);
    three.setText("3*3");
    four.setText("4*4 (making)");
    three.addActionListener(e -> {
          TwoPlayerGame twoP = new TwoPlayerGame(3);
          frm.setVisible(false);
        });
    four.setEnabled(false);
    frm.setVisible(true);
  }
}
