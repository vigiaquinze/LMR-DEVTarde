import java.awt.*;

import javax.swing.*;

public class Exercicio5Correcao extends JFrame{
    int pontuacao=0;
    public Exercicio5Correcao() {
        super("Exercício 5");
        //painel principal -> card layout
        CardLayout cl = new CardLayout();
        JPanel mainP = new JPanel(cl);
        this.add(mainP);//add painel principal ao frame
        //criar os cards -> mainP
        //card1 = start
        JPanel card1 = new JPanel();
        card1.add(new JLabel("Bem-vindo ao jogo"));
        JButton botao1 = new JButton("Começar");
        card1.add(botao1);
        mainP.add(card1,"Start");//atribuir o card ao painel principal com nome
        //card2 - primeira pergunta
        JPanel card2 = new JPanel();
        card2.add(new JLabel("Quem foi o campeão da Copa de 74?"));
        JTextField caixa1 = new JTextField(20);
        card2.add(caixa1);
        JButton botao2 = new JButton("Próxima pergunta");
        card2.add(botao2);
        mainP.add(card2,"Pergunta 1");
        //card3 - segunda pergunta
        JPanel card3 = new JPanel();
        card3.add(new JLabel("Quem foi o campeão da Copa de 78?"));
        JTextField caixa2 = new JTextField(20);
        card3.add(caixa2);
        JButton botao3 = new JButton("Próxima pergunta");
        card3.add(botao3);
        mainP.add(card3,"Pergunta 2");
        //card4 - pontuação
        JPanel card4 = new JPanel();
        JLabel pontuacaoFinal = new JLabel();
        card4.add(pontuacaoFinal);
        JButton botao4 = new JButton("Reiniciar");
        card4.add(botao4);
        mainP.add(card4, "Final");
        botao1.addActionListener(e -> {
            cl.next(mainP);
        });
        botao2.addActionListener(e -> {
            if(caixa1.getText().toLowerCase().equals("alemanha")){
                pontuacao++;
            };
            cl.next(mainP);
            caixa1.setText("");
        });
        botao3.addActionListener(e -> {
            if(caixa2.getText().toLowerCase().equals("argentina")){
                pontuacao++;
            };
            cl.next(mainP);
            caixa2.setText("");
            pontuacaoFinal.setText("Pontuação: "+pontuacao);
        });
        botao4.addActionListener(e -> {
            cl.first(mainP);
        });
        this.add(mainP);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(300, 150);
    }
}
