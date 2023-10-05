import javax.swing.*;
import java.awt.*;

public class Ex1 extends JFrame{
    public Ex1() {
        super("Exercício 1");
        JPanel mainPanel = new JPanel();
        this.add(mainPanel);
        JButton botao = new JButton("Clique aqui");
        mainPanel.add(botao);
        JFrame secondaryFrame = new JFrame();
        JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.add(new JTextArea("Alex Amargo"),BorderLayout.CENTER);
        secondaryFrame.add(textPanel);
        botao.addActionListener(e->{//listener(ouvinte/fofoqueiro)
        //evento
        secondaryFrame.setVisible(true);
        secondaryFrame.setDefaultCloseOperation(2);
        secondaryFrame.setBounds(550, 550, 150, 62);
        });
        //set
        this.setDefaultCloseOperation(2);
        this.setBounds(500, 500, 300, 125);
        this.setVisible(true);
    }
}
