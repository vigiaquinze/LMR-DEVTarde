import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    public ExemploFlowLayout() {
        JFrame janela1 = new JFrame("Janela Principal");
        //mudar o layout padrão (Grid -> Flow)
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow); //mudando o layout
        //adicionar componentes ao layout
        janela1.add(new JLabel("Informe o valor:"));
        JTextField input1 = new JTextField(25);
        janela1.add(input1);
        JButton botao1 = new JButton("Enviar");
        janela1.add(botao1);
        //set frame
        janela1.pack();
        janela1.setDefaultCloseOperation(2);
        janela1.setVisible(true);
    }
}
