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
}
