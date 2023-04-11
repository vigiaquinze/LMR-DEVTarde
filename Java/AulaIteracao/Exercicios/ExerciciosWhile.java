package AulaIteracao.Exercicios;

public class ExerciciosWhile {
public void exercicio1() {
    int vetorA[]=new int[]{15,30,45,60,75};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=vetorA[i];System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
}
