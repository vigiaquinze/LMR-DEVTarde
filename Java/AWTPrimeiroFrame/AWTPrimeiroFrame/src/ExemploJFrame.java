import java.awt.Color;

import javax.swing.JFrame;
public class ExemploJFrame extends JFrame{
    public ExemploJFrame(){
        super();
        this.setSize(300,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setBackground(Color.yellow);
    }
}
