package RevisaoFPOO;

import javax.swing.JOptionPane;

import RevisaoFPOO.Cadastro.Animais;
import RevisaoFPOO.Cadastro.Aves;
import RevisaoFPOO.Cadastro.Cachorros;
import RevisaoFPOO.Cadastro.Gatos;

public class App {
    public static void main(String[] args) {
        boolean app = true;
        boolean imprimirDados = false;
        boolean cadastro = false;
        while (app) {
            int acaoEscolhida1 = Integer.parseInt(JOptionPane.showInputDialog(
                    "O que deseja fazer?\n1 - Cadastrar um animal\n2 - Ver informações de um animal cadastrado"));
            if (acaoEscolhida1 == 1) {
                cadastro = true;
            } else if (acaoEscolhida1 == 2) {
                imprimirDados = true;
            }
            Aves cadastroAves[] = new Aves[10];
            Cachorros cadastroCachorros[] = new Cachorros[10];
            Gatos cadastroGatos[] = new Gatos[10];
            int contCadastro = 0;
            while (cadastro) {
                JOptionPane.showMessageDialog(null, "Siga na próxima tela para cadastrar seu animal",
                        "Cadastro de Animais", JOptionPane.INFORMATION_MESSAGE);
                int acaoEscolhida2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha o tipo de animal que você deseja cadastrar:\n1 - Aves\n2 - Cachorros\n3 - Gatos",
                        "Escolha de animal", JOptionPane.INFORMATION_MESSAGE));
                if (acaoEscolhida2 == 1) {
                    cadastroAves[contCadastro] = new Aves();
                    cadastroAves[contCadastro].setProprietario("Digite o nome do dono da ave:");
                    cadastroAves[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome da ave:"));
                    cadastroAves[contCadastro].setPorte(JOptionPane.showInputDialog("Digite o porte da ave:"));
                    cadastroAves[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso da ave:"));
                    cadastroAves[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça da ave:"));
                    cadastroAves[contCadastro].setIdade(JOptionPane.showInputDialog("Digite a idade da ave:"));
                    cadastroAves[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor da ave:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 2) {
                    cadastroCachorros[contCadastro] = new Cachorros();
                    cadastroCachorros[contCadastro].setProprietario("Digite o nome do dono do cachorro:");
                    cadastroCachorros[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome do cachorro:"));
                    cadastroCachorros[contCadastro]
                            .setPorte(JOptionPane.showInputDialog("Digite o porte do cachorro:"));
                    cadastroCachorros[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso do cachorro:"));
                    cadastroCachorros[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça do cachorro:"));
                    cadastroCachorros[contCadastro]
                            .setIdade(JOptionPane.showInputDialog("Digite a idade do cachorro:"));
                    cadastroCachorros[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor do cachorro:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 3) {
                    cadastroGatos[contCadastro] = new Gatos();
                    cadastroGatos[contCadastro].setProprietario("Digite o nome do dono do gato:");
                    cadastroGatos[contCadastro].setNome(JOptionPane.showInputDialog("Digite o nome do gato:"));
                    cadastroGatos[contCadastro].setPorte(JOptionPane.showInputDialog("Digite o porte do gato:"));
                    cadastroGatos[contCadastro].setPeso(JOptionPane.showInputDialog("Digite o peso do gato:"));
                    cadastroGatos[contCadastro].setRaca(JOptionPane.showInputDialog("Digite a raça do gato:"));
                    cadastroGatos[contCadastro].setIdade(JOptionPane.showInputDialog("Digite a idade do gato:"));
                    cadastroGatos[contCadastro].setCor(JOptionPane.showInputDialog("Digite a cor do gato:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",
                            JOptionPane.INFORMATION_MESSAGE);
                    contCadastro++;
                    cadastro = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um número dentre as opções apresentadas.", "Erro!",
                            JOptionPane.ERROR_MESSAGE);
                }
                ;
            }
            while (imprimirDados) {
                int acaoEscolhida3 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Qual tipo de animal você deseja ver os dados?\n1 - Aves\n2 - Cachorros\n3 - Gatos"));
                if (acaoEscolhida3 == 1) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroAves[contCadastro].getNome())) {
                            cadastroAves[cont].imprimirAve();                            
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else if (acaoEscolhida3 == 2) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroCachorros[contCadastro].getNome())) {
                            cadastroCachorros[cont].imprimirCachorro();
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else if (acaoEscolhida3 == 3) {
                    String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                    boolean busca = true;
                    int cont = 0;
                    while (busca) {
                        if (buscarNome.equals(cadastroGatos[contCadastro].getNome())) {
                            cadastroGatos[cont].imprimirGato();
                            busca = false;
                        }
                        else {cont++;};
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um número dentre as opções apresentadas.", "Erro!",
                            JOptionPane.ERROR_MESSAGE);
                }
                ;
            }
        }
    }
}
