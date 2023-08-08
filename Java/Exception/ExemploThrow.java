package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        String login = null;
        String dataNascimento = null;
        boolean app = true;
        while (app) {
            JOptionPane.showMessageDialog(null, "Bem vindo ao SENAI.");
            login = JOptionPane.showInputDialog("Digite seu login:");
            dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento (DD/MM/AA):");
            dataNascimento = dataNascimento.replace("/","");
            boolean senhaErrada = true;
            while (senhaErrada) {
                try {
                    String senha = JOptionPane.showInputDialog("Digite sua senha:");
                    if (senha.length() != 6) {
                        throw new Exception("Senha inválida! A senha deve conter exatamente 6 caracteres.");
                    } else if (senha.equals(login)) {
                        throw new Exception("Senha inválida! A senha não pode ser igual ao login.");
                    } else if (senha.equals("123456")) {
                        throw new Exception("Senha inválida! A senha não pode ser de números sequenciais.");
                    } else if (senha.equals("012345")) {
                        throw new Exception("Senha inválida! A senha não pode ser de números sequenciais.");
                    } else if (senha.equals("")) {
                        throw new Exception("Senha inválida! A senha não pode estar vazia.");
                    } else if (senha.equals(dataNascimento)) {
                        throw new Exception("Senha inválida! A senha não pode ser a sua data de nascimento.");
                    } else if (senha.matches(".*[A-Z]+.*") == false){
                        throw new Exception("A senha deve conter:\n* Pelo menos uma letra maiúscula\n* Pelo menos uma letra minúscula\n* Pelo menos um número");
                    } else if (senha.matches(".*[a-z]+.*") == false){
                        throw new Exception("A senha deve conter:\n* Pelo menos uma letra maiúscula\n* Pelo menos uma letra minúscula\n* Pelo menos um número");
                    }  else if (senha.matches(".*[0-9]+.*") == false){
                        throw new Exception("A senha deve conter:\n* Pelo menos uma letra maiúscula\n* Pelo menos uma letra minúscula\n* Pelo menos um número");
                    } else {
                        JOptionPane.showMessageDialog(null, "Seja bem-vindo, " + login);
                        app = false;
                        senhaErrada = false;
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }
    }
}
