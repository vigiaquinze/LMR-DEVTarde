package LojaCarrosList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Carros> listagemCarros = new ArrayList<>();
        String listar = "";
        // Cadastrar, consultar, listar e apagar itens cadastrados.
        boolean app = true;
        boolean opcoes = true;
        while (app) {
            JOptionPane.showMessageDialog(null, "Bem-vindo a LB Racing");
            while (opcoes) {
                int acaoEscolhida1 = Integer.parseInt(JOptionPane.showInputDialog(
                        "Opções:\n1 - Cadastrar carro\n2 - Listar carros cadastrados\n3 - Consultar dados de um carro cadastrado\n4 - Excluir um cadastro\n5 - Fechar"));
                switch (acaoEscolhida1) {
                    case 1:
                        Carros c = new Carros();
                        c.setMarca(JOptionPane.showInputDialog("Digite a marca do carro:"));
                        c.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
                        c.setAno(JOptionPane.showInputDialog("Digite o ano do carro:"));
                        c.setCor(JOptionPane.showInputDialog("Digite a cor do carro:"));
                        listagemCarros.add(c);
                        JOptionPane.showMessageDialog(null, "Carro cadastrado!");
                        break;
                    case 2:
                        for (Carros cars : listagemCarros) {
                            listar += cars.getMarca() + " " + cars.getModelo() + " " + cars.getAno();
                        }
                        JOptionPane.showMessageDialog(null, listar);
                        listar = "";
                        break;
                    case 3:
                        String buscaCarro = JOptionPane.showInputDialog("Digite o nome do carro a ser buscado");
                        for (Carros cars : listagemCarros) {
                            if (buscaCarro.equals(cars.getModelo())) {
                                for (Carros cars2 : listagemCarros) {
                                    listar += cars2.getMarca() + " " + cars2.getModelo() + " " + cars2.getAno() + " " + cars2.getCor();
                                }
                                JOptionPane.showMessageDialog(null, listar);
                                listar = "";
                            } else {
                                JOptionPane.showMessageDialog(null, "Carro não encontrado!");
                            }
                        }
                        break;
                    case 4:
                    int indexCarros = Integer.parseInt(JOptionPane.showInputDialog("Informe a índice do carro a ser deletado."));
                    listagemCarros.remove(indexCarros);
                        break;
                    case 5:
                        app = false;
                        opcoes = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Erro! Digite uma das opções apresentadas");
                }
            }
        }
    }
}
