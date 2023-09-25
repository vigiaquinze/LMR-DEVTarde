import javax.swing.*;
import java.awt.*;
import java.util.logging.Handler;

public class ExemploCardLayout extends JFrame{
    public ExemploCardLayout() {
        super("Exemplo Card Layout");
        JPanel painel1 = new JPanel();//criando o painel 1
        String comboBoxItens[] = {"Card1", "Card2"};//criando o vetor com os itens do combo box
        JComboBox cb = new JComboBox(comboBoxItens);//criando o combo box
        painel1.add(cb);//adicionando o combo box ao painel 1
        JPanel card1 = new JPanel();//criando o card 1
        card1.add(new JButton("Botão 1"));//criando os botões do card 1
        card1.add(new JButton("Botão 2"));
        card1.add(new JButton("Botão 3"));
        JPanel card2 = new JPanel();//criando o card 2
        card2.add(new JTextField("TextField", 20));//criando o text field do card 2
        JPanel cards = new JPanel(new CardLayout());//criando um card layout para adicionar os cards
        cards.add(card1,"Card1");//adicionando os cards ao card layout
        cards.add(card2,"Card2");
        this.add(painel1);//adicionando o painel 1 
        painel1.add(cards);
        //setagem do JFrame
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 150);
        cb.addItemListener(e->{
            CardLayout cl = (CardLayout) (cards.getLayout());
            cl.show(cards, (String) e.getItem());
        });
    }
}
