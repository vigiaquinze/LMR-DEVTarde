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
    }
}
