package IteracaoFor.Exercicios;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Exercício 1");
        System.out.println("");
        int nDigitado[] = new int[5];
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="); nDigitado[i]=scan.nextInt();}
        System.out.println("");
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="+nDigitado[i]);}
    }
    public void exercicio2() {
        System.out.println("");
        System.out.println("Exercício 2");
        System.out.println("");
        double nDigitado[] = new double[10];
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="); nDigitado[i]=scan.nextInt();}
        System.out.println("");
        for(int i = nDigitado.length-1;i>=0;i--){System.out.println("Vetor["+i+"]="+nDigitado[i]);}
    }
}