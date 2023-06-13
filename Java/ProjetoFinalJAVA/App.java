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
                            boolean acoesContaPf = true;
                            while (acoesContaPf) {
                                System.out.println(
                                        "Agora escolha o que deseja fazer:\n1 - Verificar saldo\n2 - Saque\n3 - Depósito\n4 - Empréstimo\n5 - Sair");
                                int acoesContaFisica = scan.nextInt();
                                switch (acoesContaFisica) {
                                    case 1:
                                        appBanco.saldoContaFisica();
                                        break;
                                    case 2:
                                        appBanco.saqueContaPf(scan.nextInt());
                                        break;
                                    case 3:
                                        appBanco.depositoContaPf(scan.nextInt());
                                        break;
                                    case 4:
                                        appBanco.pedirEmprestimoPf(scan.nextInt());
                                        break;
                                    case 5:
                                        acoesContaPf = false;
                                    default:
                                        System.out.println("Erro: Selecione uma das opções apresentadas");
                                }
                            }
                            break;
                        case 2:
                            appBanco.entrarContaJuridica();
                            boolean acoesContaPj = true;
                            while (acoesContaPj) {
                                System.out.println(
                                    "Agora escolha o que deseja fazer:\n1 - Verificar saldo\n2 - Saque\n3 - Depósito\n4 - Empréstimo\n5 - Sair");
                            int acoesContaJuridica = scan.nextInt();
                            switch (acoesContaJuridica) {
                                case 1:
                                    appBanco.saldoContaJuridica();
                                    break;
                                case 2:
                                    appBanco.saqueContaPj(scan.nextInt());
                                    break;
                                case 3:
                                    appBanco.depositoContaPj(scan.nextInt());
                                    break;
                                case 4:
                                    appBanco.pedirEmprestimoPj(scan.nextInt());
                                    break;
                                case 5:
                                    acoesContaPj = false;
                                default:
                                    System.out.println("Erro: Selecione uma das opções apresentadas");
                            }
                            }
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
            } else if (criandoContaJuridica == true && criandoContaFisica == false) {
                appBanco.criarContaJuridica();
            }
        }
    }

    public App() {
    }
}
