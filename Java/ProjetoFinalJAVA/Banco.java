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

    PessoaFisica pessoaFisica1 = new PessoaFisica(1);
    PessoaJuridica pessoaJuridica1 = new PessoaJuridica(1);

    public void criarContaJuridica() {
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
        contaJuridica1[contPj].setSaldoContaJuridica(0);
        System.out.println("Dados da conta:");
        System.out.println("Nome: " + contaJuridica1[contPj].getNome() + "\nCNPJ: " + contaJuridica1[contPj].getCnpj()
                + "\nE-mail: " + contaJuridica1[contPj].getEmail() + "\nTelefone: "
                + contaJuridica1[contPj].getTelefone() + "\nCEP: " + contaJuridica1[contPj].getCep() + "\nMunicípio: "
                + contaJuridica1[contPj].getMunicipio() + "\nEstado: " + contaJuridica1[contPj].getUf()
                + "\nNúmero de conta: " + contaJuridica1[contPj].getnConta());
        contPj++;
    }

    public void criarContaFisica() {
        contaFisica1[contPf] = pessoaFisica1;
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
        contaFisica1[contPf].setSaldoContaFisica(0);
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
                System.out.println("Dados da conta:");
                System.out.println("Nome: " + contaFisica1[cont].getNome() + "\nCPF: " + contaFisica1[cont].getCpf()
                        + "\nE-mail: " + contaFisica1[cont].getEmail() + "\nTelefone: "
                        + contaFisica1[cont].getTelefone()
                        + "\nCEP: " + contaFisica1[cont].getCep() + "\nMunicípio: "
                        + contaFisica1[cont].getMunicipio()
                        + "\nEstado: " + contaFisica1[cont].getUf());
                busca = false;
            } else {
                System.out.println("CPF não encontrado");
                cont++;
            }
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
                System.out.println("Dados da conta:");
                System.out.println(
                        "Nome: " + contaJuridica1[cont].getNome() + "\nCNPJ: " + contaJuridica1[cont].getCnpj()
                                + "\nE-mail: " + contaJuridica1[cont].getEmail() + "\nTelefone: "
                                + contaJuridica1[cont].getTelefone()
                                + "\nCEP: " + contaJuridica1[cont].getCep() + "\nMunicípio: "
                                + contaJuridica1[cont].getMunicipio()
                                + "\nEstado: " + contaJuridica1[cont].getUf());
                busca = false;
            } else {
                System.out.println("CNPJ não encontrado");
                cont++;
            }
        }
    }

    public void saqueContaPj() {
        int contPj=0;
        int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
        int novoSaldoPj = saldoPj;
        int valorSaque;
        System.out.print("Escolha qual o valor que deseja sacar:\nR$");
        valorSaque = scan.nextInt();
        if (valorSaque > saldoPj) {
            System.out.println("Erro: Você está tentando sacar um valor acima do seu saldo da conta");
        } else {
            novoSaldoPj = (valorSaque - saldoPj);
            System.out.println("Novo saldo:\nR$" + novoSaldoPj);
        }
        ;
    }

    public void saqueContaPf() {
        int contPf=0;
        int saldoPf = contaFisica1[contPf].getSaldoContaFisica();
        int novoSaldoPf = saldoPf;
        int valorSaque;
        System.out.print("Escolha qual o valor que deseja sacar:\nR$");
        valorSaque = scan.nextInt();
        if (valorSaque > saldoPf) {
            System.out.println("Erro: Você está tentando sacar um valor acima do seu saldo da conta");
        } else {
            novoSaldoPf = (valorSaque - saldoPf);
            System.out.println("Novo saldo:\nR$" + novoSaldoPf);
        }
        ;
    }

    public void depositoContaPj() {
        int contPj=0;
        int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
        int novoSaldoPj = saldoPj;
        int valorDeposito;
        System.out.print("Escolha qual o valor que deseja depositar:\nR$");
        valorDeposito = scan.nextInt();
        novoSaldoPj = (valorDeposito + saldoPj);
        System.out.println("Novo saldo:\nR$" + novoSaldoPj);
    }

    public void depositoContaPf() {
        int contPf=0;
        int saldoPf = contaFisica1[contPf].getSaldoContaFisica();
        int novoSaldoPf = saldoPf;
        int valorDeposito;
        System.out.print("Escolha qual o valor que deseja depositar:\nR$");
        valorDeposito = scan.nextInt();
        novoSaldoPf = (valorDeposito + saldoPf);
        System.out.println("Novo saldo:\nR$" + novoSaldoPf);
    }

    public void pedirEmprestimoPj() {
        int contPj=0;
        int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
        int novoSaldoPj = saldoPj;
        int valorEmprestimo;
        System.out.println("Qual o valor de empréstimo que deseja fazer?");
        valorEmprestimo = scan.nextInt();
        if (valorEmprestimo > 5000) {
            System.out.println("Desculpe, não podemos aceitar empréstimos acima de R$5000");
        } else {
            novoSaldoPj = (valorEmprestimo + saldoPj);
            System.out.println("Novo saldo: R$" + novoSaldoPj);
        }
        ;
    }

    public void pedirEmprestimoPf() {
        int contPf=0;
        int saldoPf = contaFisica1[contPf].getSaldoContaFisica();
        int novoSaldoPf = saldoPf;
        int valorEmprestimo;
        System.out.println("Qual o valor de empréstimo que deseja fazer?");
        valorEmprestimo = scan.nextInt();
        if (valorEmprestimo > 5000) {
            System.out.println("Desculpe, não podemos aceitar empréstimos acima de R$5000");
        } else {
            novoSaldoPf = (valorEmprestimo + saldoPf);
            System.out.println("Novo saldo: R$" + novoSaldoPf);
        }
        ;
    }

    public void saldoContaFisica() {
        int contPf=0;
        int saldoPf = contaFisica1[contPf].getSaldoContaFisica();
        int novoSaldoPf = saldoPf;
        System.out.print("Saldo:\nR$" + novoSaldoPf);
    }

    public void saldoContaJuridica() {
        int contPj=0;
        int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
        int novoSaldoPj = saldoPj;
        System.out.print("Saldo:\nR$" + novoSaldoPj);
    }
}