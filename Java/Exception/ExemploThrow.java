package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        String login = null;
        boolean app = true;
        while (app) {
            try {
                JOptionPane.showMessageDialog(null, "Bem vindo ao SENAI.");
                login = JOptionPane.showInputDialog("Digite seu login:");
                String senha = JOptionPane.showInputDialog("Digite sua senha:");
                    if (senha.length() != 6) {
                        throw new Exception("Senha inválida! A senha deve conter exatamente 6 caracteres.");
                    }
                    else if (senha.equals(login)) {
                        throw new Exception("A senha não pode ser igual ao login");
                    }
                    else if (senha.equals("123456")) {
                        throw new Exception("Erro! A senha não pode ser de números sequenciais");
                    }
                    else if (senha.equals("012345")) {
                        throw new Exception("Erro! A senha não pode ser de números sequenciais");
                    }
                    else if (senha.equals("")) {
                        throw new Exception("Erro! A senha não pode estar vazia");
                    }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } finally {
                JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + login);
                app=false;
            }
        }
    }
}
