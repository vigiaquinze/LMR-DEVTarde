import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex2 extends JFrame {
    //atributos
    JLabel letra;
    JLabel textoCompleto;
    JTextField caixaTexto;
    public Ex2() {
        super("Exercício 2");
        JPanel mainPanel = new JPanel(new GridLayout(6,1));
        JPanel firstPanel = new JPanel();
        firstPanel.add(new JLabel("Letra digitada: "));
        letra = new JLabel();
        firstPanel.add(letra);
        mainPanel.add(firstPanel);
        mainPanel.add(new JLabel("Digite seu texto: "));
        caixaTexto = new JTextField();
        mainPanel.add(caixaTexto);
        textoCompleto = new JLabel("");
        mainPanel.add(textoCompleto);
        this.add(mainPanel);
        //set
        this.setDefaultCloseOperation(2);
        this.setBounds(500, 500, 300, 300);
        this.setVisible(true);
        //tratamento de evento
        Handler evt = new Handler();
        caixaTexto.addKeyListener(evt);
    }
    //criar handler
    public class Handler implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {
            char keyPressed = e.getKeyChar(); //peguei o valor da tecla pressionada
            letra.setText(""+keyPressed);
            textoCompleto.setText(caixaTexto.getText());
        }

        @Override
        public void keyPressed(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {
            textoCompleto.setText(caixaTexto.getText());
        }
    }
}
