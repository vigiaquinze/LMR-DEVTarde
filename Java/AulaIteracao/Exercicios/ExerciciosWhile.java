package AulaIteracao.Exercicios;

public class ExerciciosWhile {
public void exercicio1() {
    int vetorA[]=new int[]{15,30,45,60,75};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=vetorA[i];System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
public void exercicio2() {
    int vetorA[]=new int[]{15,30,45,60,75,90,105,120};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=vetorA[i]*2; System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
public void exercicio3() {
    int vetorA[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=vetorA[i]*vetorA[i];System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
public void exercicio4() {
    int vetorA[]=new int[]{9,18,27,36,45,54,63,72,81,90,99,108,117,126,135};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=(int)Math.sqrt(vetorA[i]);System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
public void exercicio5() {
    int vetorA[]=new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
    int vetorB[]=new int[vetorA.length];
    int i=0;
    while(i<vetorA.length){vetorB[i]=vetorA[i]*i;System.out.println("VetorB["+i+"]="+vetorB[i]);i++;}
}
public void exercicio6() {
    int vetorA[]=new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
    int vetorB[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int vetorC[]=new int[15];
    int i=0;
    while(i<vetorC.length){vetorC[i]=vetorA[i]+vetorB[i];System.out.println("VetorC["+i+"]="+vetorC[i]);i++;}
}
}
