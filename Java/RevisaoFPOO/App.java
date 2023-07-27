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
            int contCadastroAves = 0;
            int contCadastroCachorros = 0;
            int contCadastroGatos = 0;
            while (cadastro) {
                JOptionPane.showMessageDialog(null, "Siga na próxima tela para cadastrar seu animal",
                        "Cadastro de Animais", JOptionPane.INFORMATION_MESSAGE);
                int acaoEscolhida2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Escolha o tipo de animal que você deseja cadastrar:\n1 - Aves\n2 - Cachorros\n3 - Gatos",
                        "Escolha de animal", JOptionPane.INFORMATION_MESSAGE));
                if (acaoEscolhida2 == 1) {
                    cadastroAves[contCadastroAves] = new Aves();
                    cadastroAves[contCadastroAves].setProprietario(JOptionPane.showInputDialog("Digite o nome do dono da ave:"));
                    cadastroAves[contCadastroAves].setNome(JOptionPane.showInputDialog("Digite o nome da ave:"));
                    cadastroAves[contCadastroAves].setPorte(JOptionPane.showInputDialog("Digite o porte da ave:"));
                    cadastroAves[contCadastroAves].setPeso(JOptionPane.showInputDialog("Digite o peso da ave:"));
                    cadastroAves[contCadastroAves].setRaca(JOptionPane.showInputDialog("Digite a raça da ave:"));
                    cadastroAves[contCadastroAves].setIdade(JOptionPane.showInputDialog("Digite a idade da ave:"));
                    cadastroAves[contCadastroAves].setCor(JOptionPane.showInputDialog("Digite a cor da ave:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",JOptionPane.INFORMATION_MESSAGE);
                    cadastroAves[contCadastroAves].imprimirAve();
                    contCadastroAves++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 2) {
                    cadastroCachorros[contCadastroCachorros] = new Cachorros();
                    cadastroCachorros[contCadastroCachorros].setProprietario(JOptionPane.showInputDialog("Digite o nome do dono do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setNome(JOptionPane.showInputDialog("Digite o nome do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setPorte(JOptionPane.showInputDialog("Digite o porte do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setPeso(JOptionPane.showInputDialog("Digite o peso do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setRaca(JOptionPane.showInputDialog("Digite a raça do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setIdade(JOptionPane.showInputDialog("Digite a idade do cachorro:"));
                    cadastroCachorros[contCadastroCachorros].setCor(JOptionPane.showInputDialog("Digite a cor do cachorro:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",JOptionPane.INFORMATION_MESSAGE);
                    cadastroCachorros[contCadastroCachorros].imprimirCachorro();
                    contCadastroCachorros++;
                    cadastro = false;
                } else if (acaoEscolhida2 == 3) {
                    cadastroGatos[contCadastroGatos] = new Gatos();
                    cadastroGatos[contCadastroGatos].setProprietario(JOptionPane.showInputDialog("Digite o nome do dono do gato:"));
                    cadastroGatos[contCadastroGatos].setNome(JOptionPane.showInputDialog("Digite o nome do gato:"));
                    cadastroGatos[contCadastroGatos].setPorte(JOptionPane.showInputDialog("Digite o porte do gato:"));
                    cadastroGatos[contCadastroGatos].setPeso(JOptionPane.showInputDialog("Digite o peso do gato:"));
                    cadastroGatos[contCadastroGatos].setRaca(JOptionPane.showInputDialog("Digite a raça do gato:"));
                    cadastroGatos[contCadastroGatos].setIdade(JOptionPane.showInputDialog("Digite a idade do gato:"));
                    cadastroGatos[contCadastroGatos].setCor(JOptionPane.showInputDialog("Digite a cor do gato:"));
                    JOptionPane.showMessageDialog(null, "Animal cadastrado!", "Cadastro de Animais",JOptionPane.INFORMATION_MESSAGE);
                    cadastroGatos[contCadastroGatos].imprimirGato();
                    contCadastroGatos++;
                    cadastro = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Escolha um número dentre as opções apresentadas.", "Erro!",JOptionPane.ERROR_MESSAGE);
                }
                ;
            }
            while (imprimirDados) {
                int acaoEscolhida3 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Qual tipo de animal você deseja ver os dados?\n1 - Aves\n2 - Cachorros\n3 - Gatos"));
                if (acaoEscolhida3 == 1) {
                    boolean busca = true;
                    int contAve = 0;
                    while (busca) {
                            String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                        if (buscarNome.equals(cadastroAves[contCadastroAves].getNome())) {
                            contCadastroAves = contAve;
                            cadastroAves[contCadastroAves].imprimirAve();
                            busca = false;
                        } else {
                            contAve++;
                        }
                        ;
                    }
                } else if (acaoEscolhida3 == 2) {
                    boolean busca = true;
                    int contCachorros = 0;
                    while (busca) {
                            String buscarNome = JOptionPane.showInputDialog(
                            "Informe o nome a ser Buscado");
                            contCachorros = contCadastroCachorros;
                        if (buscarNome.equals(cadastroCachorros[contCadastroCachorros].getNome())) {
                            cadastroCachorros[contCadastroCachorros].imprimirCachorro();
                            busca = false;
                        } else {
                            contCachorros++;
                        }
                        ;
                    }
                } else if (acaoEscolhida3 == 3) {
                    boolean busca = true;
                    int contGatos = 0;
                    while (busca) {
                        String buscarNome = JOptionPane.showInputDialog(
                        "Informe o nome a ser Buscado");
                        if (buscarNome.equals(cadastroGatos[contCadastroGatos].getNome())) {
                            contCadastroGatos = contGatos;
                            cadastroGatos[contCadastroGatos].imprimirGato();
                            busca = false;
                        } else {
                            contGatos++;
                        }
                        ;
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
