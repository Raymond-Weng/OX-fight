import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class actionListener2 implements ActionListener {
  private int i;

  private int o;

  private int length;

  public actionListener2(int i, int o, int length) {
    this.i = i;
    this.o = o;
    this.length = length;
  }

  public void actionPerformed(ActionEvent e) {
    boolean isntEnd = SingleGame.press(this.i, this.o, this.length);
    if (isntEnd)
      SingleGame.com(3);
  }
}
