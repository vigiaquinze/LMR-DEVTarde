package Java.ExercicioOperadores;

import java.util.Scanner;

public class Exercicio {
    Scanner scan = new Scanner(System.in);
    public void notas() {
        System.out.println("Para o aluno ser aprovado, ele precisa ter média das notas igual ou maior que 50 e frequência maior que 75%");
        System.out.println("Insira a primeira nota:");
        double notaUm = scan.nextDouble();
        System.out.println("Insira a segunda nota");
        double notaDois = scan.nextDouble();
        System.out.println("Insira a porcentagem de frequência do aluno:");
        double porcentagemFrequencia = scan.nextDouble();
        

    }
}
