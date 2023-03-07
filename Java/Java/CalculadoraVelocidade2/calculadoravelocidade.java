package Java.CalculadoraVelocidade2;

import java.util.Scanner;

public class calculadoravelocidade {
    Scanner scan = new Scanner(System.in);
    public void Calcular() {
        System.out.println("Informe a distância percorrida (em km)");
        double distanciaPercorrida = scan.nextDouble(); System.out.println("km");
        System.out.println("Informe o tempo gasto (em horas)");
        double tempoGasto = scan.nextDouble(); System.out.println("horas");
        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("A velocidade média é "+velocidadeMedia+" km/h");
    }
    public void Destino() {
        System.out.println("Informe o seu local de origem");
        String cidadeOrigem = scan.next();
        System.out.println("Informe o seu local de destino");
        String cidadeDestino = scan.next();
        System.out.println("Em sua viagem, você vai de "+cidadeOrigem+" para "+cidadeDestino+"");
        scan.close();
    }
}
