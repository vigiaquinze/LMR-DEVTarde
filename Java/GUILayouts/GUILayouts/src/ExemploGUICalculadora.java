import javax.swing.*;
import java.awt.*;

public class ExemploGUICalculadora extends JFrame{
    String valores[]={"7", "8", "9", "X", "6", "5", "4", "-", "3", "2", "1", "+", "/", "0", ".", "="};
    public ExemploGUICalculadora() {
        super("Calculadora");
        //painel pincipal tipo border
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);
        //add texto ao north
        painel1.add(new JTextField(15),BorderLayout.NORTH);
        //add painel2 ao center
        JPanel painel2 = new JPanel(new GridLayout(4,4));
        painel1.add(painel2,BorderLayout.CENTER);
        //preencher o painel2
        for (int i = 0; i < valores.length; i++) {
            painel2.add(new JButton(valores[i]));
        }
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
