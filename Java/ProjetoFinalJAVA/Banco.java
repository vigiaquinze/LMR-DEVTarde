package ProjetoFinalJAVA;

import java.util.Scanner;

public class Banco {
    public Banco() {
    }
    Scanner scan = new Scanner(System.in);
    PessoaJuridica contaJuridica1[] = new PessoaJuridica[10];
    PessoaFisica contaFisica1[] = new PessoaFisica[10];
    int contPf = 0;
    int contPj = 0;
    int contaAtual = 0;
    public void criarContaJuridica() {
        contaJuridica1[contPj] = new PessoaJuridica();
        System.out.println("Criação de conta jurídica");
        System.out.println("Digite seu nome:");
        contaJuridica1[contPj].setNome(scan.nextLine());
        System.out.println("Digite seu CNPJ:");
        contaJuridica1[contPj].setCnpj(scan.nextLine());
        System.out.println("Digite seu e-mail:");
        contaJuridica1[contPj].setEmail(scan.nextLine());
        System.out.println("Digite seu telefone:");
        contaJuridica1[contPj].setTelefone(scan.nextLine());
        System.out.println("Digite seu CEP:");
        contaJuridica1[contPj].setCep(scan.nextLine());
        System.out.println("Digite seu município:");
        contaJuridica1[contPj].setMunicipio(scan.nextLine());
        System.out.println("Digite seu estado:");
        contaJuridica1[contPj].setUf(scan.nextLine());
        System.out.println("Dados da conta:");
        System.out.println("Nome: " + contaJuridica1[contPj].getNome() + "\nCNPJ: " + contaJuridica1[contPj].getCnpj()
                + "\nE-mail: " + contaJuridica1[contPj].getEmail() + "\nTelefone: "
                + contaJuridica1[contPj].getTelefone() + "\nCEP: " + contaJuridica1[contPj].getCep() + "\nMunicípio: "
                + contaJuridica1[contPj].getMunicipio() + "\nEstado: " + contaJuridica1[contPj].getUf()
                + "\nNúmero de conta: " + contaJuridica1[contPj].getnConta());
        contPj++;
    }

    public void criarContaFisica() {
        contaFisica1[contPf] = new PessoaFisica();
        System.out.println("Criação de conta física");
        System.out.println("Digite seu nome:");
        contaFisica1[contPf].setNome(scan.nextLine());
        System.out.println("Digite seu CPF:");
        contaFisica1[contPf].setCpf(scan.nextLine());
        System.out.println("Digite seu e-mail:");
        contaFisica1[contPf].setEmail(scan.nextLine());
        System.out.println("Digite seu telefone:");
        contaFisica1[contPf].setTelefone(scan.nextLine());
        System.out.println("Digite seu CEP:");
        contaFisica1[contPf].setCep(scan.nextLine());
        System.out.println("Digite seu município:");
        contaFisica1[contPf].setMunicipio(scan.nextLine());
        System.out.println("Digite seu estado:");
        contaFisica1[contPf].setUf(scan.nextLine());
        System.out.println("Dados da conta:");
        System.out.println("Nome: " + contaFisica1[contPf].getNome() + "\nCPF: " + contaFisica1[contPf].getCpf()
                + "\nE-mail: " + contaFisica1[contPf].getEmail() + "\nTelefone: " + contaFisica1[contPf].getTelefone()
                + "\nCEP: " + contaFisica1[contPf].getCep() + "\nMunicípio: " + contaFisica1[contPf].getMunicipio()
                + "\nEstado: " + contaFisica1[contPf].getUf());
        contPf++;
    }


    public void entrarContaFisica() {
        boolean busca = true;
        int cont = 0;
        while (busca) {
            System.out.println("Entrar em conta física");
            System.out.println("CPF com pontuação: ");
            String buscarCPF = scan.nextLine();
            if (buscarCPF.equals(contaFisica1[cont].getCpf())) {
                contaAtual = cont;
                cont++;
                busca = false;
            }
            else {System.out.println("CPF não encontrado");}
        }
    }

    public void entrarContaJuridica() {
        boolean busca = true;
        int cont = 0;
        while (busca) {
            System.out.println("Entrar em conta jurídica");
            System.out.println("CNPJ com pontuação: ");
            String buscarCNPJ = scan.nextLine();
            if (buscarCNPJ.equals(contaJuridica1[cont].getCnpj())) {
                contaAtual = cont;
                cont++;
                busca = false;
            }
            else {System.out.println("CNPJ não encontrado");}
        }
    }

        public void saqueContaPj(int valorSaque) {
            int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
            valorSaque -= saldoPj;
            System.out.print("Escolha qual o valor que deseja sacar:\nR$");
            valorSaque = scan.nextInt();
            if (valorSaque < saldoPj) {
                System.out.println("Erro: Você está tentando sacar um valor acima do seu saldo da conta");
            } else {
                System.out.println("Novo saldo:\nR$" + (saldoPj-valorSaque));
            }
            ;
        }
        public void saqueContaPf(int valorSaque) {
            int saldoPf = contaFisica1[contPj].getSaldoContaFisica();
            valorSaque -= saldoPf;
            System.out.print("Escolha qual o valor que deseja sacar:\nR$");
            valorSaque = scan.nextInt();
            if (valorSaque < saldoPf) {
                System.out.println("Erro: Você está tentando sacar um valor acima do seu saldo da conta");
            } else {
                System.out.println("Novo saldo:\nR$" +(saldoPf-valorSaque));
            }
            ;
        }

        public void depositoContaPj(int valorDeposito) {
            int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
            valorDeposito += saldoPj;
            System.out.print("Escolha qual o valor que deseja depositar:\nR$");
            valorDeposito = scan.nextInt();
            System.out.println("Novo saldo:\nR$" + saldoPj+valorDeposito);
        }
        public void depositoContaPf(int valorDeposito) {
            int saldoPf = contaFisica1[contPj].getSaldoContaFisica();
            valorDeposito += saldoPf;
            System.out.print("Escolha qual o valor que deseja depositar:\nR$");
            valorDeposito = scan.nextInt();
            System.out.println("Novo saldo:\nR$" + saldoPf+valorDeposito);
        }

        public void pedirEmprestimoPj(int valorEmprestimo) {
            int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
            valorEmprestimo += saldoPj;
            System.out.println("Qual o valor de empréstimo que deseja fazer?");
            valorEmprestimo = scan.nextInt();
            if (valorEmprestimo > 5000) {
                System.out.println("Desculpe, não podemos aceitar empréstimos acima de R$5000");
            } else {
                System.out.println("Novo saldo: R$" + saldoPj);
            }
            ;
        }
        public void pedirEmprestimoPf(int valorEmprestimo) {
            int saldoPf = contaFisica1[contPj].getSaldoContaFisica();
            valorEmprestimo += saldoPf;
            System.out.println("Qual o valor de empréstimo que deseja fazer?");
            valorEmprestimo = scan.nextInt();
            if (valorEmprestimo > 5000) {
                System.out.println("Desculpe, não podemos aceitar empréstimos acima de R$5000");
            } else {
                System.out.println("Novo saldo: R$" + saldoPf);
            }
            ;
        }
        public void saldoContaFisica() {
            int contPf = 0;
            int saldoPf = contaFisica1[contPj].getSaldoContaFisica();
            System.out.println("Saldo: R$" + saldoPf);
        }

        public void saldoContaJuridica() {
            int contPj = 0;
            int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
            System.out.println("Saldo: R$" + saldoPj);
        }
    }