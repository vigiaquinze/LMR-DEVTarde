package Matriz;

import java.util.Random;
import java.util.Scanner;

public class Matrizes {
    Scanner scan = new Scanner(System.in);
    Random rndm = new Random();

    public void matrizes() {
        // criar, preencher e declarar a matriz
        // declarar a matriz
        int matriz[][] = new int[10][9];// duas dimensões
        // preencher a minha matriz
        for (int i = 0; i < 10; i++) { // 1ª dimensão
            for (int j = 0; j < 9; j++) { // 2ª dimensão
                // System.out.println("Matriz ["+i+"] ["+j+"]: ");
                matriz[i][j] = rndm.nextInt(6);// usando random para preencher a matriz
            }
        }
        // impressão dos elementos da matriz individualmente
        for (int i = 0; i < 10; i++) {// 1ª dimensão
            for (int j = 0; j < 9; j++) {// 2ª dimensão
                System.out.println("Matriz [" + i + "] [" + j + "]: " + matriz[i][j]);
            }
        }
        // imprimir em formato de matriz 10x9
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        int somaLinha4 = 0;
        for (int i = 0; i < matriz[3].length; i++) {
            somaLinha4 += matriz[3][i];
        }
        System.out.println("A soma da 4ª linha é: " + somaLinha4);
        int somaColuna4 = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna4 += matriz[i][3];
        }
        System.out.println("A soma da 4ª coluna é: " + somaColuna4);
    }

    public void exercicio1() {
        int matrizEx[][] = new int[5][5];
        for (int i = 0; i < matrizEx.length; i++) {
            for (int j = 0; j < matrizEx[0].length; j++) {
                if (matrizEx[i] == matrizEx[j]) {
                    matrizEx[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < matrizEx.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizEx.length; j++) {
                System.out.print(" " + matrizEx[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void exercicio2() {
        int matrizEx[][] = new int[5][5];
        for (int i = 0; i < matrizEx.length; i++) {
            for (int j = 0; j < matrizEx.length; j++) {
                matrizEx[i][j] = rndm.nextInt(0, 5);
            }
        }
        System.out.println("Matriz: ");
        for (int i = 0; i < matrizEx.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizEx[0].length; j++) {
                System.out.print(" " + matrizEx[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("Matriz transposta: ");
        for (int i = 0; i < matrizEx.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matrizEx[0].length; j++) {
                System.out.print(" " + matrizEx[j][i] + " ");
            }
            System.out.println("|");
        }
        int somaDiagonal = 0;
        int somaInfDiagonal = 0;
        int somaSupDiagonal = 0;
        for (int i = 0; i < matrizEx.length; i++) {
            for (int j = 0; j < matrizEx.length; j++) {
                if (i == j) {
                    somaDiagonal += matrizEx[i][j];
                } else if (j>i) {
                    somaSupDiagonal += matrizEx[i][j];
                } else {
                    somaInfDiagonal += matrizEx[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal é: " + somaDiagonal);
        System.out.println("A soma superior a diagonal é: " + somaSupDiagonal);
        System.out.println("A soma inferior a diagonal é: " + somaInfDiagonal);
    }
}