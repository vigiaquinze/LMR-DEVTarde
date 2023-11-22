import Connection.ConnectionFactory;
import Control.CarrosDAO;
import Control.UsuariosDAO;

import View.MainFrame;

public class App {
    public static void main(String[] args) throws Exception {
        new CarrosDAO().criaTabela();
        new UsuariosDAO().criaTabela();
        new MainFrame().run();
    }
}
