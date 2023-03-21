package ExerciciosArray;

import java.util.Scanner;

public class Exercicios {
    Scanner scan = new Scanner(System.in);

    public void exercicio1() {
        System.out.println("Faça um programa que leia um vetor de 5 números inteiros e mostre-os.");
        double listaValores[]=new double[5];
        listaValores[0]=2;
        listaValores[1]=4;
        listaValores[2]=6;
        listaValores[3]=8;
        listaValores[4]=10;
        System.out.println("O valor do índice 0 é "+listaValores[0]);
        System.out.println("O valor do índice 1 é "+listaValores[1]);
        System.out.println("O valor do índice 2 é "+listaValores[2]);
        System.out.println("O valor do índice 3 é "+listaValores[3]);
        System.out.println("O valor do índice 4 é "+listaValores[4]);
    }

    public void exercicio2() {
        System.out.println("Faça um programa que leia um vetor de 10 números inteiros e os exiba na ordem inversa.");
        int listaValoresDois[]=new int[10];
        listaValoresDois[0]=1;
        listaValoresDois[1]=2;
        listaValoresDois[2]=3;
        listaValoresDois[3]=4;
        listaValoresDois[4]=5;
        listaValoresDois[5]=6;
        listaValoresDois[6]=7;
        listaValoresDois[7]=8;
        listaValoresDois[8]=9;
        listaValoresDois[9]=10;
        System.out.println("O valor do índice 9 é "+listaValoresDois[9]);
        System.out.println("O valor do índice 8 é "+listaValoresDois[8]);
        System.out.println("O valor do índice 7 é "+listaValoresDois[7]);
        System.out.println("O valor do índice 6 é "+listaValoresDois[6]);
        System.out.println("O valor do índice 5 é "+listaValoresDois[5]);
        System.out.println("O valor do índice 4 é "+listaValoresDois[4]);
        System.out.println("O valor do índice 3 é "+listaValoresDois[3]);
        System.out.println("O valor do índice 2 é "+listaValoresDois[2]);
        System.out.println("O valor do índice 1 é "+listaValoresDois[1]);
        System.out.println("O valor do índice 0 é "+listaValoresDois[0]);
    }

    public void exercicio3() {
        System.out.println("Faça um programa que leia quatro notas, mostre as notas e a média na tela.");
        double notasAluno[]=new double[4];
        System.out.println("Insira a primeira nota:");
        notasAluno[0]=scan.nextDouble();
        System.out.println("Insira a segunda nota:");
        notasAluno[1]=scan.nextDouble();
        System.out.println("Insira a terceira nota:");
        notasAluno[2]=scan.nextDouble();
        System.out.println("Insira a quarta nota");
        notasAluno[3]=scan.nextDouble();
        System.out.println("1ª nota: "+notasAluno[0]);
        System.out.println("2ª nota: "+notasAluno[1]);
        System.out.println("3ª nota: "+notasAluno[2]);
        System.out.println("4ª nota: "+notasAluno[3]);
        System.out.println("A média do aluno: "+(notasAluno[0]+notasAluno[1]+notasAluno[2]+notasAluno[3])/4);
    }
}
