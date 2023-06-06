package ProjetoFinalJAVA;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Banco appBanco = new Banco();
        boolean ligado = true;
        boolean criandoContaJuridica = false;
        boolean criandoContaFisica = false;
        int acaoEscolhida2;
        while (ligado) {
            System.out.println("Escolha o tipo de ação desejada:\n1 - Criar conta\n2 - Entrar em uma conta existente");
            int acaoEscolhida1 = scan.nextInt();
            switch (acaoEscolhida1) {
                case 1:
                    System.out.println(
                            "Agora escolha qual tipo de conta deseja criar:\n1 - Pessoa física\n2 - Pessoa jurídica");
                    acaoEscolhida2 = scan.nextInt();
                    switch (acaoEscolhida2) {
                        case 1:
                            criandoContaFisica = true;
                            criandoContaJuridica = false;
                            break;
                        case 2:
                            criandoContaJuridica = true;
                            criandoContaFisica = false;
                            break;
                        default:
                            System.out.println("Erro: Digite um número dentre as opções apresentadas.");
                    }
                    break;
                case 2:
                    System.out.println(
                            "Agora escolha qual tipo de conta deseja entrar:\n1 - Pessoa física\n2 - Pessoa jurídica");
                    acaoEscolhida2 = scan.nextInt();
                    switch (acaoEscolhida2) {
                        case 1:
                        appBanco.entrarContaFisica();
                        break;
                        case 2:
                        appBanco.entrarContaJuridica();
                        break;
                        default:
                        System.out.println("Erro: Digite um número dentre as opções apresentadas.");
                    }
                    break;
                default:
                    System.out.println("Erro: Digite um número dentre as opções apresentadas.");
            }
            if (criandoContaFisica == true && criandoContaJuridica == false) {
                appBanco.criarContaFisica();
                appBanco.imprimirContaFisica();
            }
            else if (criandoContaJuridica == true && criandoContaFisica == false) {
                appBanco.criarContaJuridica();
                appBanco.imprimirContaJuridica();
            };
        }
    }
}
