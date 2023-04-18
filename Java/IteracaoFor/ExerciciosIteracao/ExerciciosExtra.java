package IteracaoFor.ExerciciosIteracao;

import java.util.Scanner;

public class ExerciciosExtra {
    Scanner scan = new Scanner(System.in);
    public void exercicio1() {
        System.out.println("Exercício 1");
        System.out.println("");
        int nDigitado[] = new int[5];
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="); nDigitado[i]=scan.nextInt();}
        System.out.println("");
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="+nDigitado[i]);}
    }
    public void exercicio2() {
        System.out.println("");
        System.out.println("Exercício 2");
        System.out.println("");
        double nDigitado[] = new double[10];
        for(int i=0;i<nDigitado.length;i++){System.out.println("Vetor["+i+"]="); nDigitado[i]=scan.nextInt();}
        System.out.println("");
        //imprimir o vetor na ordem inversa
        for(int i = nDigitado.length-1;i>=0;i--){System.out.println("Vetor["+i+"]="+nDigitado[i]);}
    }
    public void exercicio3() {
        System.out.println("");
        System.out.println("Exercício 3");
        System.out.println("");
        //Criar um vetor para receber as notas
        double notaDigitada[] = new double[4];
        //Preencher o vetor com as 4 notas "fori"
        for(int i=0;i<notaDigitada.length;i++)
        //Pedir para informar a nota e lê-la
        {System.out.println("Nota "+(i+1)+": "); notaDigitada[i]=scan.nextInt();}
        System.out.println("");
        double notaMedia = 0;
        //Printar as notas
        for(int i=0;i<notaDigitada.length;i++){System.out.println("Nota "+(i+1)+": "+notaDigitada[i]); notaMedia+=notaDigitada[i];}
        //Calcular e printar a média
        System.out.println("Média: "+notaMedia/4);
    }
    public void exercicio4() {
        System.out.println("");
        System.out.println("Exercício 4");
        System.out.println("");
        //Criar um vetor de 10 caracteres
        String letrasDigitadas[] = new String[]{"a","b","c","d","e","f","g","h","i","j"};
        //Caso fosse uma char: char letraDigitada[] = new char[]{'a','b','c','d','e','f','g','h','i','j'};
        //Percorrer o vetor para achar as consoantes "fori"
        int cont=0;//contador para vogais
        for (int i = 0; i < letrasDigitadas.length; i++) {
            //Tomada de decisão: vogal ou consoante
            if(letrasDigitadas[i]=="a"||letrasDigitadas[i]=="e"||letrasDigitadas[i]=="i"){System.out.println(letrasDigitadas[i]+" é uma vogal."); cont++;}
            else{System.out.println(letrasDigitadas[i]+" é uma consoante");}
        //Caso quisesse fazer uma descomparação para consoantes: if(letrasDigitadas[i]!="a"&&letrasDigitadas[i]!="e"&&letrasDigitadas[i]!="i")
        //Mostrar o número de vogais
        System.out.println("O número de vogais é "+cont);
        }
    }
    public void exercicio4Extra() {
        System.out.println("");
        System.out.println("Exercício 4 Extra");
        System.out.println("");
        //Usuário vai digitar a palavra
        System.out.println("Digite uma palavra: ");
        String palavra = scan.next();
        palavra = palavra.toLowerCase();
        int cont=0;//contador para vogais
        for (int i = 0; i < palavra.length(); i++) {
            //Tomada de decisão: vogal ou consoante
            char c = palavra.charAt(i); //
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){System.out.println(c+" é uma vogal."); cont++;}
            else{System.out.println(c+" é uma consoante");}
        }
        //Mostrar o número de vogais
        System.out.println("O número de vogais é "+cont);
    }
    public void exercicio5() {
        System.out.println("");
        System.out.println("Exercício 5");
        System.out.println("");
        int vetorNumeros[]= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int contPar=0; //contador de números pares
        int contImpar=0; //contador de números ímpares
        //percorrer o vetor e contar os números pares e ímpares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){contPar++;}
            else{contImpar++;}
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        //distribuir os números nos vetores par e ímpar
        contPar=0;
        contImpar=0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if(vetorNumeros[i]%2==0){nPar[contPar]=vetorNumeros[i];contPar++;}
            else{nImpar[contImpar]=vetorNumeros[i];contImpar++;}
        }
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Vetor ["+i+"] = "+vetorNumeros[i]);
        }
        for (int i = 0; i <nPar.length; i++) {
            System.out.println("Vetor ["+i+"] = "+nPar[i]);
        }
        for (int i = 0; i <nImpar.length; i++) {
            System.out.println("Vetor ["+i+"] = "+nImpar[i]);
        }
    }
    public void exercicio6() {
        System.out.println("");
        System.out.println("Exercício 6");
        System.out.println("");
    }
    public void exercicio7() {
        System.out.println("");
        System.out.println("Exercício 7");
        System.out.println("");
    }
    public void exercicio8() {
        System.out.println("");
        System.out.println("Exercício 8");
        System.out.println("");
    }
    public void exercicio9() {
        System.out.println("");
        System.out.println("Exercício 9");
        System.out.println("");
    }
}