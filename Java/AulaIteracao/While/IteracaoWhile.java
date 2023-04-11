package AulaIteracao.While;

import java.util.Random;
import java.util.Scanner;

public class IteracaoWhile {
    Scanner scan = new Scanner(System.in);
    public void exemplo1() {
        int i=0;
        while(i<10){System.out.println("O n° da iteração é "+i);i++;}
    }
    public void exemplo2() {
        int vetor[]= new int[10];
        int i=0;
        while(i<10){System.out.println("Informe o valor do vetor["+i+"]=");vetor[i]=scan.nextInt();i++;}
        while(i>0){i--;System.out.println("vetor["+i+"]="+vetor[i]);}
    }
    public void exemplo3() {
        Random rd = new Random();
        int nAleatorio = rd.nextInt(10)+1;
        boolean tenteNovamente = true;
        while(tenteNovamente){System.out.println("Digite um número de um a dez: ");int nDigitado=scan.nextInt();if(nDigitado==nAleatorio){System.out.println("Você acertou!"); tenteNovamente = false;} else {System.out.println("Você errou! Tente novamente.");}}
    }
}
