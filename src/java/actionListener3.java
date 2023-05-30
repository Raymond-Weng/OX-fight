import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class actionListener3 implements ActionListener {
  private int i;

  private int o;

  public actionListener3(int i, int o) {
    this.i = i;
    this.o = o;
  }

  public void actionPerformed(ActionEvent e) {
    TwoPlayerGame.press(this.i, this.o);
  }
}
