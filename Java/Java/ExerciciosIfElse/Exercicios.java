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
        System.out.println("2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga se ela poderá ou não votar este ano \n (não é necessário considerar o mês em que ela nasceu).");
        System.out.println("Insira o ano de nascimento");
        int anoNascimento = scan.nextInt();
        if (anoNascimento>=2008){System.out.println("Você não poderá votar este ano.");}
        else {System.out.println("Você poderá votar este ano.");}
    }
    public void exerc3() {
        System.out.println("3. Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as \n seguintes mensagens: ACESSO PERMITIDO caso a senha seja válida. ACESSO NEGADO caso a senha seja inválida.");
        System.out.println("Digite a senha:");
        int senhaAcesso = scan.nextInt();
        if (senhaAcesso==1234){System.out.println("Acesso Permitido");}
        else {System.out.println("Acesso Negado.");}
    }
    public void exerc4() {
        System.out.println("4. As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$0,25 se forem compradas pelo menos doze. Escreva um programa que \n leia o número de maçãs compradas, calcule e escreva o valor total da compra.");
        System.out.println("Quantas maçãs você vai comprar?");
        int quantidadeMacas = scan.nextInt();
        if (quantidadeMacas>=12){System.out.println("Você vai pagar R$" +quantidadeMacas*0.25);}
        else {System.out.println("Você vai pagar R$" +quantidadeMacas*0.30);}
    }
    public void exerc5() {
        System.out.println("5. Escreva um programa para ler 3 valores inteiros (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.");
        System.out.println("Digite o primeiro valor");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo valor");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro valor");
        int terceiroNumero = scan.nextInt();
        if (primeiroNumero>segundoNumero&&segundoNumero>terceiroNumero) {System.out.println(+primeiroNumero +segundoNumero +terceiroNumero);}
        else if (primeiroNumero>terceiroNumero&&terceiroNumero>segundoNumero) {System.out.println("A ordem é: " +primeiroNumero+" "+terceiroNumero+" "+segundoNumero+" ");}
        else if (segundoNumero>primeiroNumero&&primeiroNumero>terceiroNumero) {System.out.println("A ordem é: "+segundoNumero+" "+primeiroNumero+" "+terceiroNumero+" ");}
        else if (segundoNumero>terceiroNumero&&terceiroNumero>primeiroNumero) {System.out.println("A ordem é: "+segundoNumero+" "+terceiroNumero+" "+primeiroNumero+" ");}
        else if (terceiroNumero>primeiroNumero&&primeiroNumero>segundoNumero) {System.out.println("A ordem é: "+terceiroNumero+" "+primeiroNumero+" "+segundoNumero+" ");}
        else if (terceiroNumero>segundoNumero&&segundoNumero>primeiroNumero) {System.out.println("A ordem é: "+terceiroNumero+" "+segundoNumero+" "+primeiroNumero+" ");}
    }
    public void exerc6() {
        System.out.println("6. Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino; 2:masculino) de uma pessoa, construa um programa que calcule e imprima \n seu peso ideal, utilizando as seguintes. Fórmulas: - para homens: (72.7*Altura) – 58; - para mulheres: (62.1*Altura)– 44.7;");
        System.out.println("Qual o seu sexo? 1 para feminino e 2 para masculino");
        double sexoEscolhido = scan.nextDouble();
        System.out.println("Qual sua altura?");
        double altura = scan.nextDouble();
        double pesoIdeal;
        if (sexoEscolhido==1) {
            pesoIdeal=((62.1*altura)-44.7);
        }
        else {
            pesoIdeal=((72.7*altura)-58.0);
        }
        System.out.println("Seu peso ideal é" +pesoIdeal+ "KG");
    }
    public void exerc7() {
        System.out.println("Para o aluno ser aprovado, ele precisa ter média das notas igual ou maior que 50 e frequência maior que 75%");
        System.out.println("Insira a primeira nota:");
        double notaUm = scan.nextDouble();
        System.out.println("Insira a segunda nota");
        double notaDois = scan.nextDouble();
        double notaMedia = (notaUm+notaDois/10);
        System.out.println("A média de notas do aluno é" +notaMedia);
        System.out.println("Insira a porcentagem de frequência do aluno:");
        double porcentagemFrequencia = scan.nextDouble();
        if (porcentagemFrequencia>=75&&notaMedia>=50) {System.out.println("O aluno está aprovado.");}
        else {System.out.println("O aluno está reprovado.");}
    }
    }

