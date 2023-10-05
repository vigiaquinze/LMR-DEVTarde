import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ExemploNomeSobrenome
 */
public class ExemploNomeSobrenome extends JFrame {
    //atributos
    private JTextField caixaNome;
    private JTextField caixaSobrenome;
    private JLabel nomeConcatenado;
    //construtor
    public ExemploNomeSobrenome() {
        super("Exemplo 1 - Eventos");
        //criar o painel principal -> grid 3x2
        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //criar os componentes
        mainPanel.add(new JLabel("Digite seu nome:"));
        caixaNome = new JTextField();
        mainPanel.add(caixaNome);
        mainPanel.add(new JLabel("Digite seu sobrenome:"));
        caixaSobrenome = new JTextField();
        mainPanel.add(caixaSobrenome);
        JButton botao = new JButton("Juntar");
        mainPanel.add(botao);
        nomeConcatenado = new JLabel();
        mainPanel.add(nomeConcatenado);
        //tratamento de eventos

        //1a forma: e->{evento} /callback
        //botao.addActionListener(e->{//listener(ouvinte/fofoqueiro)
            //evento
        //    nomeConcatenado.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //    caixaNome.setText(" ");
        //    caixaSobrenome.setText(" ");
        //});

        //2a forma: "new ActionListener" -> actionPerformed(ActionEvent)
        botao.addActionListener(new ActionListener() {//listener
            public void actionPerformed(ActionEvent e){
                //evento
                nomeConcatenado.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
                caixaNome.setText(" ");
                caixaSobrenome.setText(" ");
            }
        });

        // //3a forma: Handler (manipulador)
        // //criar uma classe para tratar o evento -> chamar o listener
        // Handler evt = new Handler();
        // botao.addActionListener(evt);

        //setando o frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 125);
        this.setVisible(true);
    }
        // //criar a classe handler
        // public class Handler implements ActionListener{
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         //evento
        //         nomeConcatenado.setText(caixaNome.getText()+" "+caixaSobrenome.getText());
        //         caixaNome.setText(" ");
        //         caixaSobrenome.setText(" ");
        //     }
        // }
}