package ExercicioSwitch;

import java.util.Scanner;

public class ExerciciosSwitch {
    Scanner scan = new Scanner(System.in);
    public void exercicio1() {
        //1. receber a letra digitada pelo usuário//
        System.out.println("Digite uma letra para saber se ela é uma vogal ou uma consoante:");
        String letraEscolhida = scan.nextLine();
        //2. escolher o resultado referente a letra//
        String tipoLetra=""; 
        switch(letraEscolhida){
            case "a": tipoLetra="vogal";
            break;
            case "e": tipoLetra="vogal";
            break;
            case "i": tipoLetra="vogal";
            break;
            case "o": tipoLetra="vogal";
            break;
            case "u": tipoLetra="vogal";
            break;
            case "A": tipoLetra="vogal";
            break;
            case "E": tipoLetra="vogal";
            break;
            case "I": tipoLetra="vogal";
            break;
            case "O": tipoLetra="vogal";
            break;
            case "U": tipoLetra="vogal";
            break;
            default: tipoLetra="consoante";
            break;
        }
        //3. mostrar o resultado para o usuario//
        System.out.println(letraEscolhida+ " é uma "+tipoLetra);
    }
    public void exercicio2() {
        //1. receber o mes digitado pelo usuario, em formato de numero//
        System.out.println("Digite o número do mês que você quer saber:");
        int mesNumero = scan.nextInt();
        //2. escolher o resultado referente ao mes//
        String mesNome = "";
        switch (mesNumero){
            case 1: mesNome="Janeiro";
            break;
            case 2: mesNome="Fevereiro";
            break;
            case 3:mesNome="Março";
            break;
            case 4: mesNome="Abril";
            break;
            case 5: mesNome="Maio";
            break;
            case 6: mesNome="Junho";
            break;
            case 7: mesNome="Julho";
            break;
            case 8: mesNome="Agosto";
            break;
            case 9: mesNome="Setembro";
            break;
            case 10: mesNome="Outubro";
            break;
            case 11: mesNome="Novembro";
            break;
            case 12: mesNome="Dezembro";
            break;
            default: mesNome="um mês que não existe";
        }
        //3. mostrar o resultado para o usuario//
        System.out.println("O número "+mesNumero+" é referente a "+mesNome);
    }
}
