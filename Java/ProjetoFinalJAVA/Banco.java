package ProjetoFinalJAVA;

import java.util.Scanner;

public class Banco {
    public Banco() {
        contaJuridica1[0].setSaldoContaJuridica(1);
        contaFisica1[0].setSaldoContaFisica(1);
        contaJuridica1[1].setSaldoContaJuridica(1);
        contaFisica1[1].setSaldoContaFisica(1);
        contaJuridica1[2].setSaldoContaJuridica(1);
        contaFisica1[2].setSaldoContaFisica(1);
        contaJuridica1[3].setSaldoContaJuridica(1);
        contaFisica1[3].setSaldoContaFisica(1);
        contaJuridica1[4].setSaldoContaJuridica(1);
        contaFisica1[4].setSaldoContaFisica(1);
        contaJuridica1[5].setSaldoContaJuridica(1);
        contaFisica1[5].setSaldoContaFisica(1);
        contaJuridica1[6].setSaldoContaJuridica(1);
        contaFisica1[6].setSaldoContaFisica(1);
        contaJuridica1[7].setSaldoContaJuridica(1);
        contaFisica1[7].setSaldoContaFisica(1);
        contaJuridica1[8].setSaldoContaJuridica(1);
        contaFisica1[8].setSaldoContaFisica(1);
        contaJuridica1[9].setSaldoContaJuridica(1);
        contaFisica1[9].setSaldoContaFisica(1);
        contaJuridica1[10].setSaldoContaJuridica(1);
        contaFisica1[10].setSaldoContaFisica(1);
        int saldoPf = contaFisica1[contPf].getSaldoContaFisica();
        int saldoPj = contaJuridica1[contPj].getSaldoContaJuridica();
        int novoSaldoPf = saldoPf;
        int novoSaldoPj = saldoPj;
    }

    Scanner scan = new Scanner(System.in);
    PessoaJuridica contaJuridica1[] = new PessoaJuridica[10];
    PessoaFisica contaFisica1[] = new PessoaFisica[10];
    int contPf = 0;
    int contPj = 0;
    int contaAtual = 0;

    public void definirSaldo() {
        contaJuridica1[0].setSaldoContaJuridica(1);
        contaFisica1[0].setSaldoContaFisica(1);
        contaJuridica1[1].setSaldoContaJuridica(1);
        contaFisica1[1].setSaldoContaFisica(1);
        contaJuridica1[2].setSaldoContaJuridica(1);
        contaFisica1[2].setSaldoContaFisica(1);
        contaJuridica1[3].setSaldoContaJuridica(1);
        contaFisica1[3].setSaldoContaFisica(1);
        contaJuridica1[4].setSaldoContaJuridica(1);
        contaFisica1[4].setSaldoContaFisica(1);
        contaJuridica1[5].setSaldoContaJuridica(1);
        contaFisica1[5].setSaldoContaFisica(1);
        contaJuridica1[6].setSaldoContaJuridica(1);
        contaFisica1[6].setSaldoContaFisica(1);
        contaJuridica1[7].setSaldoContaJuridica(1);
        contaFisica1[7].setSaldoContaFisica(1);
        contaJuridica1[8].setSaldoContaJuridica(1);
        contaFisica1[8].setSaldoContaFisica(1);
        contaJuridica1[9].setSaldoContaJuridica(1);
        contaFisica1[9].setSaldoContaFisica(1);
        contaJuridica1[10].setSaldoContaJuridica(1);
        contaFisica1[10].setSaldoContaFisica(1);
    }

    
    PessoaFisica pessoaFisica1 = new PessoaFisica(1);
    PessoaJuridica pessoaJuridica1 = new PessoaJuridica(1);
    pessoaFisica1.setSaldoContaFisica(0);
    int saldoPf = contaFisica1[0].getSaldoContaFisica();
    int saldoPj = contaJuridica1[0].getSaldoContaJuridica();
    int novoSaldoPf = saldoPf;
    int novoSaldoPj = saldoPj;

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
            } else {
                System.out.println("CPF não encontrado");
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
                cont++;
                busca = false;
            } else {
                System.out.println("CNPJ não encontrado");
            }
        }
    }

    public void saqueContaPj() {
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
        int valorDeposito;
        System.out.print("Escolha qual o valor que deseja depositar:\nR$");
        valorDeposito = scan.nextInt();
        novoSaldoPj = (valorDeposito + saldoPj);
        System.out.println("Novo saldo:\nR$" + novoSaldoPj);
    }

    public void depositoContaPf() {
        int valorDeposito;
        System.out.print("Escolha qual o valor que deseja depositar:\nR$");
        valorDeposito = scan.nextInt();
        novoSaldoPf = (valorDeposito + saldoPf);
        System.out.println("Novo saldo:\nR$" + novoSaldoPf);
    }

    public void pedirEmprestimoPj() {
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
        System.out.print("Saldo:\nR$" + novoSaldoPf);
    }

    public void saldoContaJuridica() {
        System.out.print("Saldo:\nR$" + novoSaldoPj);
    }
}