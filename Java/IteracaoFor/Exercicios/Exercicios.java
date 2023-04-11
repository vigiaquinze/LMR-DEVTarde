package IteracaoFor.Exercicios;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Exercício 1");
        System.out.println("");
        int nDigitado[] = new int[5];
        System.out.println("Digite o primeiro número");
        nDigitado[0]=scan.nextInt();
        System.out.println("Digite o segundo número");
        nDigitado[1]=scan.nextInt();
        System.out.println("Digite o terceiro número");
        nDigitado[2]=scan.nextInt();
        System.out.println("Digite o quarto número");
        nDigitado[3]=scan.nextInt();
        System.out.println("Digite o quinto número");
        nDigitado[4]=scan.nextInt();
        for(int i=0;i<nDigitado.length;i++){System.out.println("Número "+nDigitado[i]);}
    }
}