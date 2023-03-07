package ExerciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);
    public void exerc1() {
        System.out.println("1. Escreva um programa para ler 2 valores (considere que não serão informados valores iguais) e escrever o maior deles.");
        System.out.println("Insira o primeiro valor");
        double primeiroValor = scan.nextDouble();
        System.out.println("Insira o segundo valor");
        double segundoValor = scan.nextDouble();
        double maiorValor = 0.0;
        if (primeiroValor>=segundoValor){primeiroValor=maiorValor}
        else (primeiroValor<=segundoValor){segundoValor=maiorValor}
        System.out.println(+maiorValor);
    }
    public void exerc2() {
        
    }
    public void exerc3() {
        
    }
    public void exerc4() {
        
    }
    public void exerc5() {
        
    }
    public void exerc6() {
        
    }
}
