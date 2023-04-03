package AulaRevisaoVetores;

import java.util.Scanner;

public class ExercicioVetores {
    Scanner scan = new Scanner(System.in);
    public void revisaoExercicio() {
        double vetorDouble[] = new double[10];
        System.out.println("Digite o valor do 1º índice");
        vetorDouble[0]=scan.nextDouble();
        System.out.println("Digite o valor do 2º índice");
        vetorDouble[1]=scan.nextDouble();
        System.out.println("Digite o valor do 3º índice");
        vetorDouble[2]=scan.nextDouble();
        System.out.println("Digite o valor do 4º índice");
        vetorDouble[3]=scan.nextDouble();
        System.out.println("Digite o valor do 5º índice");
        vetorDouble[4]=scan.nextDouble();
        System.out.println("Digite o valor do 6º índice");
        vetorDouble[5]=scan.nextDouble();
        System.out.println("Digite o valor do 7º índice");
        vetorDouble[6]=scan.nextDouble();
        System.out.println("Digite o valor do 8º índice");
        vetorDouble[7]=scan.nextDouble();
        System.out.println("Digite o valor do 9º índice");
        vetorDouble[8]=scan.nextDouble();
        System.out.println("Digite o valor do 10º índice");
        vetorDouble[9]=scan.nextDouble();
        System.out.println("O primeiro índice é "+vetorDouble[0]);
        System.out.println("O segundo índice é "+vetorDouble[1]);
        System.out.println("O terceiro índice é "+vetorDouble[2]);
        System.out.println("O quarto índice é "+vetorDouble[3]);
        System.out.println("O quinto índice é "+vetorDouble[4]);
        System.out.println("O sexto índice é "+vetorDouble[5]);
        System.out.println("O sétimo índice é "+vetorDouble[6]);
        System.out.println("O oitavo índice é "+vetorDouble[7]);
        System.out.println("O nono índice é "+vetorDouble[8]);
        System.out.println("O décimo índice é "+vetorDouble[9]);
    }
}
