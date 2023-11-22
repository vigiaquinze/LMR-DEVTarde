package View;

import javax.swing.*;

public class MainFrame extends JFrame {
   public MainFrame() {
    super("Loja de Carros");
    setDefaultCloseOperation(2);
    //adicionando abas do painel
    JTabbedPane abas = new JTabbedPane();
    abas.add("Carros", new CarrosGUI());
    abas.add("Usuários", new UsuariosGUI());
    abas.add("Vendas", new VendasGUI());
    add(abas);
   } 
   public void run() {
    pack();
    setVisible(true);
   }
}
