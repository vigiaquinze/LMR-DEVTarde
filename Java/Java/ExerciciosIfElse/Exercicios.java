package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);
    public void exerc1() {
        System.out.println("1. Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.");
        System.out.println("Insira o primeiro valor");
        int primeiroValor = scan.nextInt();
        System.out.println("Insira o segundo valor");
        int segundoValor = scan.nextInt();
        int maiorValor = 0;
        if (primeiroValor>=segundoValor){maiorValor+=primeiroValor;}
        else {maiorValor=+segundoValor;};
        System.out.println("O maior valor é "+maiorValor);
    }
    public void exerc2() {
        System.out.println("2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).");
        System.out.println("Insira o ano de nascimento");
        int anoNascimento = scan.nextInt();
        if (anoNascimento>=2008){System.out.println("Você não poderá votar este ano.");}
        else {System.out.println("Você poderá votar este ano.");}
    }
    public void exerc3() {
        System.out.println("3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.");
        System.out.println("Digite a senha:");
        int senhaAcesso = scan.nextInt();
        if (senhaAcesso==1234){System.out.println("Acesso Permitido");}
        else {System.out.println("Acesso Negado.");}
    }
    public void exerc4() {
        System.out.println("4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.");
        System.out.println("Quantas maçãs você vai comprar?");
        int quantidadeMacas = scan.nextInt();
        if (quantidadeMacas>=12){System.out.println("Você vai pagar R$" +quantidadeMacas*0.25);}
        else {System.out.println("Você vai pagar R$" +quantidadeMacas*0.30);}
    }
    public void exerc5() {
        
    }
    public void exerc6() {
        
    }
}
