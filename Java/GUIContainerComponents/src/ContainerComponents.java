import javax.swing.*;
import java.awt.*;

public class ContainerComponents extends JFrame {
    public ContainerComponents() {
        super("Janela Principal");
        // adicionar outro container
        JPanel container1 = new JPanel();
        this.getContentPane().add(container1);
        // adicionar componentes ao container
        container1.add(new JLabel("Informe um número"));
        JTextField campo1 = new JTextField("Informe o valor aqui...", 25);
        container1.add(campo1);
        JButton botao1 = new JButton("Enviar");
        container1.add(botao1);
        //usar uma listener para o botão
        botao1.addActionListener(e->{
            int quantidade1 = Integer.parseInt(campo1.getText());
            for (int i = 1; i <= quantidade1; i++) {
                container1.add(new JButton(""+i));
            }
            this.pack();
        });
        //set do frame
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
