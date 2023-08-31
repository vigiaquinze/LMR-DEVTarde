import javax.swing.JFrame;

public class JFrameExemplo extends JFrame{
    public JFrameExemplo() {
        super("Minha primeira janela com JFrame GUISwing");
        this.setSize(900, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
