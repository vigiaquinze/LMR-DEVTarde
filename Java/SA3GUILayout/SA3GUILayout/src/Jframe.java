import javax.swing.*;
import java.awt.*;

public class Jframe extends JFrame{
    public Jframe() {
        super("SA3");
        this.add(new JtabbedPane());
        this.setBounds(500,250,500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
    }
}