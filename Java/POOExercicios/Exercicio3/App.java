package POOExercicios.Exercicio3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // criar o elevador
        Elevador elevador1 = new Elevador(10, 10);
        // iniciar
        elevador1.inicializa();
        boolean ligado = true;
        // loop do elevador
        while (ligado) {
            System.out.println("Escolha a ação desejada"
                    + "\n1 - Entrar"
                    + "\n2 - Sair"
                    + "\n3 - Subir"
                    + "\n4 - Descer"
                    + "\n5 - Desligar");
            int acao = scan.nextInt();
            switch (acao) {
                case 1:
                    System.out.println("Capacidade: " + elevador1.entra());
                    break;
                case 2:
                    System.out.println("Capacidade: " + elevador1.sai());
                    break;
                case 3:
                    System.out.println("Quantos andares deseja subir?");
                    System.out.println("Andar atual: " + elevador1.sobe(scan.nextInt()));
                    break;
                case 4:
                    System.out.println("Quantos andares deseja descer?");
                    System.out.println("Andar atual: " + elevador1.desce(scan.nextInt()));
                    break;
                case 5:
                    ligado = false;
                default:
                    System.out.println("Digite uma ação válida");
                    break;
            }
        }
    }
}
