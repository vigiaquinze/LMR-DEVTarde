import javax.swing.*;

public class ClickJButton extends JFrame{
    //atributo
    int cont=0;
    public ClickJButton() {
        super("Click");
        JPanel painel1 = new JPanel();
        //criar os componentes no painel
        JButton botao1 = new JButton("Clique aqui");
        painel1.add(botao1);
        JLabel texto1 = new JLabel("Número de cliques");
        painel1.add(texto1);
        botao1.addActionListener(e->{
            cont++;
            texto1.setText("número de cliques: "+cont);
            this.pack();
        });
        this.getContentPane().add(painel1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
