import javax.swing.JOptionPane;

public class JOptionPaneExemplo extends JOptionPane{
    //atributo
    String informacao = "Minha dialog JOptionPane";
    public JOptionPaneExemplo(){
        super();
        this.showMessageDialog(getComponentPopupMenu(), informacao, informacao, INFORMATION_MESSAGE);
    }
}
