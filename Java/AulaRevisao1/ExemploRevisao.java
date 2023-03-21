package AulaRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner scan = new Scanner(System.in);
    public void exemplo1() {
        //1º: Ler a 1ª nota do aluno.
        System.out.println("Informe a primeira nota do aluno:");
        int primeiraNota = scan.nextInt();
        //2º: Ler a 2ª nota do aluno.
        System.out.println("Informe a segunda nota do aluno:");
        int segundaNota = scan.nextInt();
        //3º: Calcular a média das duas notas do aluno.
        double notaMedia = (primeiraNota+segundaNota)/2;
        //4º: Mostrar a média do aluno.
        System.out.println("A média do aluno é: "+notaMedia);
        //5º: Ler o total de aulas da disciplina.
        System.out.println("Informe o total de aulas da disciplina: ");
        int totalAulas = scan.nextInt();
        //6º: Ler o total de faltas do aluno.
        System.out.println("Informe o total de faltas do aluno: ");
        int totalFaltas = scan.nextInt();
        //7º: Calcular a porcentagem de frequência.
        int porcentagemFrequencia = (totalAulas-totalFaltas)*100/totalAulas;
        //8º: Mostrar a porcentagem de frequência.
        System.out.println("A porcentagem de frequência do aluno é: "+porcentagemFrequencia+"%");
        //9º: Se média for igual ou maior que 50 e a frequência maior ou igual a 75, então mostre: "Aluno aprovado".
        //9º²: Se média for inferior a 50 e a frequência inferior a 75, então mostre: "Aluno reprovado".
        if (notaMedia>=50&&porcentagemFrequencia>=75){System.out.println("O aluno está aprovado.");}
        else {System.out.println("O aluno está reprovado.");}
    }
}
