package ProjetoFinalJAVA;

import java.util.Scanner;

public class Banco{
    Scanner scan = new Scanner (System.in);
    PessoaJuridica contaJuridica1 = new PessoaJuridica();
    PessoaFisica contaFisica1 = new PessoaFisica();
    public void criarContaJuridica() {
        System.out.println("Criação de conta jurídica");
        System.out.println("Digite seu nome:");
        contaJuridica1.setNome(scan.nextLine());
        System.out.println("Digite seu CNPJ:");
        contaJuridica1.setCnpj(scan.nextLine());
        System.out.println("Digite seu e-mail:");
        contaJuridica1.setEmail(scan.nextLine());
        System.out.println("Digite seu telefone:");
        contaJuridica1.setTelefone(scan.nextLine());
        System.out.println("Digite seu CEP:");
        contaJuridica1.setCep(scan.nextLine());
        System.out.println("Digite seu município:");
        contaJuridica1.setMunicipio(scan.nextLine());
        System.out.println("Digite seu estado:");
        contaJuridica1.setUf(scan.nextLine());
    }
    public void criarContaFisica() {
        System.out.println("Criação de conta física");
        System.out.println("Digite seu nome:");
        contaFisica1.setNome(scan.nextLine());
        System.out.println("Digite seu CPF:");
        contaFisica1.setCpf(scan.nextLine());
        System.out.println("Digite seu e-mail:");
        contaFisica1.setEmail(scan.nextLine());
        System.out.println("Digite seu telefone:");
        contaFisica1.setTelefone(scan.nextLine());
        System.out.println("Digite seu CEP:");
        contaFisica1.setCep(scan.nextLine());
        System.out.println("Digite seu município:");
        contaFisica1.setMunicipio(scan.nextLine());
        System.out.println("Digite seu estado:");
        contaFisica1.setUf(scan.nextLine());
    }
    public void imprimirContaJuridica() {
        System.out.println("Dados da conta:");
        System.out.println("Nome: "+contaJuridica1.getNome()+"\nCNPJ: "+contaJuridica1.getCnpj()+"\nE-mail: "+contaJuridica1.getEmail()+"\nTelefone: "+contaJuridica1.getTelefone()+"\nCEP: "+contaJuridica1.getCep()+"\nMunicípio: "+contaJuridica1.getMunicipio()+"\nEstado: "+contaJuridica1.getUf());
    }
    public void imprimirContaFisica() {
        System.out.println("Dados da conta:");
        System.out.println("Nome: "+contaFisica1.getNome()+"\nCPF: "+contaFisica1.getCpf()+"\nE-mail: "+contaFisica1.getEmail()+"\nTelefone: "+contaFisica1.getTelefone()+"\nCEP: "+contaFisica1.getCep()+"\nMunicípio: "+contaFisica1.getMunicipio()+"\nEstado: "+contaFisica1.getUf());
    }
    public void entrarContaFisica() {
        System.out.println("Entrar em conta física");
        System.out.println("CPF: ");
        String buscarCPF = scan.nextLine();
        boolean busca = true;
        int cont = 0;
        while (busca){
            if (buscarCPF.equals(contaFisica1.getCpf())){
                busca=false;
                imprimirContaFisica();
            }
            cont++;
        }
    }
    public void entrarContaJuridica() {
        System.out.println("Entrar em conta jurídica");
        System.out.println("CNPJ: ");
        String buscarCNPJ = scan.nextLine();
        boolean busca = true;
        int cont = 0;
        while (busca){
            if (buscarCNPJ.equals(contaJuridica1.getCnpj())){
                busca=false;
                imprimirContaJuridica();
            }
            cont++;
        }
    }
}
