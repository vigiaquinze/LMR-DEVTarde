package ExemploArray;

public class Vetores {
    public void exemplo1() {
        // criando um vetor//
        double[] valores = new double[] { 27.1, 12.6, 3.3, 9.1 };
        System.out.println("1ª posição - Índice[0]: " + valores[0]);
        System.out.println("1ª posição - Índice[1]: " + valores[1]);
        System.out.println("1ª posição - Índice[2]: " + valores[2]);
        System.out.println("1ª posição - Índice[3]: " + valores[3]);
        // mudando valores de uma posição definida//
        valores[0] = 21.7; // mudando o valor do índice 0//
        System.out.println("Novo valor da 1ª posição - Índice[0]: " + valores[0]);
    }
    public void exemplo2() {
        //criando o vetor//
        int[] novosValores = new int[5];
        //int novosValores[]=new int[5];//
        novosValores[0]= 10;
        novosValores[1]= 15;
        novosValores[2]= 20;
        novosValores[3]= 25;
        novosValores[4]= 30;
        System.out.println("O vetor de índice 0 é "+novosValores[0]);
        System.out.println("O vetor de índice 1 é "+novosValores[1]);
        System.out.println("O vetor de índice 2 é "+novosValores[2]);
        System.out.println("O vetor de índice 3 é "+novosValores[3]);
        System.out.println("O vetor de índice 4 é "+novosValores[4]);
    }
}
