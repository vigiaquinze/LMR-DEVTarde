package ExercicioVetoresExtra;

import java.lang.Math;

public class Exercicio {
    public void exercicio1() {
        int vetorA[] = new int[]{1,2,3,4,5};
        int vetorB[] = new int[5];
        vetorB[0] = vetorA[0];
        vetorB[1] = vetorA[1];
        vetorB[2] = vetorA[2];
        vetorB[3] = vetorA[3];
        vetorB[4] = vetorA[4];
        System.out.println("Exercício 1 \n O valor do vetor A de índice 0 é "+vetorA[0]+" e o valor do vetor B de índice 0 é "+vetorB[0]);
    }
    public void exercicio2() {
        int vetorA[] = new int []{1,2,3,4,5,6,7,8};
        int vetorB[] = new int [8];
        vetorB[0] = vetorA[0]*2;
        vetorB[1] = vetorA[1]*2;
        vetorB[2] = vetorA[2]*2;
        vetorB[3] = vetorA[3]*2;
        vetorB[4] = vetorA[4]*2;
        vetorB[5] = vetorA[5]*2;
        vetorB[6] = vetorA[6]*2;
        vetorB[7] = vetorA[7]*2;
        System.out.println("");
        System.out.println("Exercício 2");
        System.out.println("O valor do vetor A de índice 0 é "+vetorA[0]+" e o do vetor B de índice 0 é "+vetorB[0]);
        System.out.println("O valor do vetor A de índice 1 é "+vetorA[1]+" e o do vetor B de índice 1 é "+vetorB[1]);
        System.out.println("O valor do vetor A de índice 2 é "+vetorA[2]+" e o do vetor B de índice 2 é "+vetorB[2]);
        System.out.println("O valor do vetor A de índice 3 é "+vetorA[3]+" e o do vetor B de índice 3 é "+vetorB[3]);
        System.out.println("O valor do vetor A de índice 4 é "+vetorA[4]+" e o do vetor B de índice 4 é "+vetorB[4]);
        System.out.println("O valor do vetor A de índice 5 é "+vetorA[5]+" e o do vetor B de índice 5 é "+vetorB[5]);
        System.out.println("O valor do vetor A de índice 6 é "+vetorA[6]+" e o do vetor B de índice 6 é "+vetorB[6]);
        System.out.println("O valor do vetor A de índice 7 é "+vetorA[7]+" e o do vetor B de índice 7 é "+vetorB[7]);
    }
    public void exercicio3() {
        int vetorA[] = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int [15];
        vetorB[0] = vetorA[0]*vetorA[0];
        vetorB[1] = vetorA[1]*vetorA[1];
        vetorB[2] = vetorA[2]*vetorA[2];
        vetorB[3] = vetorA[3]*vetorA[3];
        vetorB[4] = vetorA[4]*vetorA[4];
        vetorB[5] = vetorA[5]*vetorA[5];
        vetorB[6] = vetorA[6]*vetorA[6];
        vetorB[7] = vetorA[7]*vetorA[7];
        vetorB[8] = vetorA[8]*vetorA[8];
        vetorB[9] = vetorA[9]*vetorA[9];
        vetorB[10] = vetorA[10]*vetorA[10];
        vetorB[11] = vetorA[11]*vetorA[11];
        vetorB[12] = vetorA[12]*vetorA[12];
        vetorB[13] = vetorA[13]*vetorA[13];
        vetorB[14] = vetorA[14]*vetorA[14];
        System.out.println("");
        System.out.println("Exercício 3");
        System.out.println("O valor do vetor A de índice 0 é "+vetorA[0]+" e o do vetor B de índice 0 é "+vetorB[0]);
        System.out.println("O valor do vetor A de índice 1 é "+vetorA[1]+" e o do vetor B de índice 1 é "+vetorB[1]);
        System.out.println("O valor do vetor A de índice 2 é "+vetorA[2]+" e o do vetor B de índice 2 é "+vetorB[2]);
        System.out.println("O valor do vetor A de índice 3 é "+vetorA[3]+" e o do vetor B de índice 3 é "+vetorB[3]);
        System.out.println("O valor do vetor A de índice 4 é "+vetorA[4]+" e o do vetor B de índice 4 é "+vetorB[4]);
        System.out.println("O valor do vetor A de índice 5 é "+vetorA[5]+" e o do vetor B de índice 5 é "+vetorB[5]);
        System.out.println("O valor do vetor A de índice 6 é "+vetorA[6]+" e o do vetor B de índice 6 é "+vetorB[6]);
        System.out.println("O valor do vetor A de índice 7 é "+vetorA[7]+" e o do vetor B de índice 7 é "+vetorB[7]);
        System.out.println("O valor do vetor A de índice 8 é "+vetorA[8]+" e o do vetor B de índice 8 é "+vetorB[8]);
        System.out.println("O valor do vetor A de índice 9 é "+vetorA[9]+" e o do vetor B de índice 9 é "+vetorB[9]);
        System.out.println("O valor do vetor A de índice 10 é "+vetorA[10]+" e o do vetor B de índice 10 é "+vetorB[10]);
        System.out.println("O valor do vetor A de índice 11 é "+vetorA[11]+" e o do vetor B de índice 11 é "+vetorB[11]);
        System.out.println("O valor do vetor A de índice 12 é "+vetorA[12]+" e o do vetor B de índice 12 é "+vetorB[12]);
        System.out.println("O valor do vetor A de índice 13 é "+vetorA[13]+" e o do vetor B de índice 13 é "+vetorB[13]);
        System.out.println("O valor do vetor A de índice 14 é "+vetorA[14]+" e o do vetor B de índice 14 é "+vetorB[14]);
    }
    public void exercicio4() {
        int vetorA[] = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int vetorB[] = new int [15];
        vetorB[0] = (int) Math.sqrt(vetorA[0]);
        vetorB[1] = (int) Math.sqrt(vetorA[1]);
        vetorB[2] = (int) Math.sqrt(vetorA[2]);
        vetorB[3] = (int) Math.sqrt(vetorA[3]);
        vetorB[4] = (int) Math.sqrt(vetorA[4]);
        vetorB[5] = (int) Math.sqrt(vetorA[5]);
        vetorB[6] = (int) Math.sqrt(vetorA[6]);
        vetorB[7] = (int) Math.sqrt(vetorA[7]);
        vetorB[8] = (int) Math.sqrt(vetorA[8]);
        vetorB[9] = (int) Math.sqrt(vetorA[9]);
        vetorB[10] = (int) Math.sqrt(vetorA[10]);
        vetorB[11] = (int) Math.sqrt(vetorA[11]);
        vetorB[12] = (int) Math.sqrt(vetorA[12]);
        vetorB[13] = (int) Math.sqrt(vetorA[13]);
        vetorB[14] = (int) Math.sqrt(vetorA[14]);
        System.out.println("");
        System.out.println("Exercício 4");
        System.out.println("O valor do vetor A de índice 0 é "+vetorA[0]+" e o do vetor B de índice 0 é "+vetorB[0]);
        System.out.println("O valor do vetor A de índice 1 é "+vetorA[1]+" e o do vetor B de índice 1 é "+vetorB[1]);
        System.out.println("O valor do vetor A de índice 2 é "+vetorA[2]+" e o do vetor B de índice 2 é "+vetorB[2]);
        System.out.println("O valor do vetor A de índice 3 é "+vetorA[3]+" e o do vetor B de índice 3 é "+vetorB[3]);
        System.out.println("O valor do vetor A de índice 4 é "+vetorA[4]+" e o do vetor B de índice 4 é "+vetorB[4]);
        System.out.println("O valor do vetor A de índice 5 é "+vetorA[5]+" e o do vetor B de índice 5 é "+vetorB[5]);
        System.out.println("O valor do vetor A de índice 6 é "+vetorA[6]+" e o do vetor B de índice 6 é "+vetorB[6]);
        System.out.println("O valor do vetor A de índice 7 é "+vetorA[7]+" e o do vetor B de índice 7 é "+vetorB[7]);
        System.out.println("O valor do vetor A de índice 8 é "+vetorA[8]+" e o do vetor B de índice 8 é "+vetorB[8]);
        System.out.println("O valor do vetor A de índice 9 é "+vetorA[9]+" e o do vetor B de índice 9 é "+vetorB[9]);
        System.out.println("O valor do vetor A de índice 10 é "+vetorA[10]+" e o do vetor B de índice 10 é "+vetorB[10]);
        System.out.println("O valor do vetor A de índice 11 é "+vetorA[11]+" e o do vetor B de índice 11 é "+vetorB[11]);
        System.out.println("O valor do vetor A de índice 12 é "+vetorA[12]+" e o do vetor B de índice 12 é "+vetorB[12]);
        System.out.println("O valor do vetor A de índice 13 é "+vetorA[13]+" e o do vetor B de índice 13 é "+vetorB[13]);
        System.out.println("O valor do vetor A de índice 14 é "+vetorA[14]+" e o do vetor B de índice 14 é "+vetorB[14]);
    }
    public void exercicio5() {

    }
    public void exercicio6() {

    }
}
