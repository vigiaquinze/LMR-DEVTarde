package AvaliacaoFormativa2305;

import java.util.Scanner;
import java.util.Random;

public class Exercicios {
    Scanner scan = new Scanner(System.in);
    Random rndm = new Random();

    public void exercicio1() {
        System.out.println("Exercício 1:");
        System.out.println(" ");
        System.out.println("Digite quantas linhas você quer:");
        int linhas = scan.nextInt();
        System.out.println("Digite quantas colunas você quer:");
        int colunas = scan.nextInt();
        int[] matrizLinhas = new int[linhas];
        int[] matrizColunas = new int[colunas];
        int matrizLC[][] = new int[linhas][colunas];
        for (int i = 0; i < matrizLinhas.length; i++) {
            for (int j = 0; j < matrizColunas.length; j++) {
                matrizLC[i][j] = rndm.nextInt(9);
            }
        }
        System.out.println(" ");
        for (int i = 0; i < matrizLC.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizLC[0].length; j++) {
                System.out.print(" " + matrizLC[i][j] + " ");
            }
            System.out.println("|");
        }
        for (int i = 0; i < matrizLC.length; i++) {
            for (int j = 0; j < matrizLC[0].length; j++) {
                if (i > j) {
                    matrizLC[i][j] = 1;
                } else if (i == j) {
                    matrizLC[i][j] = 0;
                } else if (j > i) {
                    matrizLC[i][j] = 2;
                }
            }
        }
        System.out.println(" ");
        System.out.println("Nova matriz:");
        System.out.println(" ");
        for (int i = 0; i < matrizLC.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizLC[0].length; j++) {
                System.out.print(" " + matrizLC[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        System.out.println("Exercício 2:");
        System.out.println(" ");
        int nAleatorio = rndm.nextInt(1000);
        int cont = 0;
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Dê um palpite e tente acertar o número:");
            int nDigitado = scan.nextInt();
            if (nDigitado == nAleatorio) {
                System.out.println("Você acertou! Você conseguiu acertar em "+cont+" tentativas!");
                tenteNovamente = false;
            } else if (nDigitado > nAleatorio) {
                System.out.println("Você errou! Tente novamente. Dica: É um número menor que " + nDigitado);
                cont++;
            } else if (nDigitado < nAleatorio) {
                System.out.println("Você errou! Tente novamente. Dica: É um número maior que " + nDigitado);
                cont++;
            }
        }
    }
    public void exercicio3() {
        System.out.println("Exercício 3:");
        System.out.println(" ");
        int matriz [] = new int [rndm.nextInt(1,10)];
        int cont = 0;
        int contImpar = 0;
        int contPar = 0;
        int contImparPar = 0;
        int contParImpar = 0;
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = rndm.nextInt(1,100);
        }
        for (int i = 0; i < matriz.length; i++) {
            cont++;
        }
        System.out.println("Quantidade de números: "+cont);
        System.out.println(" ");
        System.out.println("Números pares:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2==0){System.out.print(" " + matriz[i] + " ");};
        }
        System.out.println(" ");
        System.out.println("Números ímpares:");
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2>0){System.out.print(" " + matriz[i] + " ");};
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2==0){;contPar++;};
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2>0){contImpar++;};
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2==0&&(i+1)%2>0){contParImpar++;};
        }
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i]%2>0&&(i+1)%2==0){contImparPar++;};
        }
        System.out.println(" ");
        System.out.println("Números pares: "+contPar);
        System.out.println("Números ímpares: "+contImpar);
        System.out.println(" ");
        System.out.println("Números pares em matrizes ímpares: "+contParImpar);
        System.out.println("Números ímpares em matrizes pares: "+contImparPar);

    }
}
