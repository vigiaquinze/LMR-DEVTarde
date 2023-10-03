import javax.swing.*;
import java.awt.*;
import java.util.logging.Handler;

public class Exercicio5 extends JFrame{
    int cont=0;
    public Exercicio5() {
        super("Jogo das lendas");
        JPanel painel1 = new JPanel();
        String comboBoxItens[] = {"Tela de jogo", "Tela de pontuação"};
        JComboBox cb = new JComboBox(comboBoxItens);
        painel1.add(cb);
        JPanel card1 = new JPanel();
        JButton botaoPontos = new JButton("Clique aqui");
        JLabel texto1 = new JLabel("Número de cliques: "+cont);
        botaoPontos.addActionListener(e->{
            cont++;
            texto1.setText("Número de cliques: "+cont);
        });
        card1.add(botaoPontos);
        JPanel card2 = new JPanel();
        card2.add(texto1);
        JPanel cards = new JPanel(new CardLayout());
        cards.add(card1,"Tela de jogo");//adicionando os cards ao card layout
        cards.add(card2,"Tela de pontuação");
        painel1.add(cards);
        this.add(painel1);
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
