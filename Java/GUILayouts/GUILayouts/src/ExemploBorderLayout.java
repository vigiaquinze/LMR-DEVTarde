import java.awt.*;

import javax.swing.*;

public class ExemploBorderLayout extends JFrame{
    public ExemploBorderLayout() {
        super("Principal");
        //Criando um JPanel e selecionando layout
        JPanel painel1 = new JPanel(new BorderLayout());
        this.add(painel1);
        //criar os componentes
        JButton botao1 = new JButton();
        painel1.add(new JButton("North"),BorderLayout.NORTH);
        painel1.add(new JButton("South"),BorderLayout.SOUTH);
        painel1.add(new JButton("West"),BorderLayout.WEST);
        painel1.add(new JButton("East"),BorderLayout.EAST);
        painel1.add(new JButton("Center"),BorderLayout.CENTER);
        //set frame
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
