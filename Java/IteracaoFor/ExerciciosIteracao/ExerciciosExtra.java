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
        double alunosCadastrados[] = new double[10];
        double mediasAlunos[] = new double[10];
        double notasAluno1[] = new double[4];
        for (int i = 0; i < notasAluno1.length; i++) {System.out.println("Nota "+(i+1)+" do 1° aluno: "); notasAluno1[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno1 = 0;
        for (int i = 0; i < notasAluno1.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno1[i]); mediaAluno1+=notasAluno1[i];}
        System.out.println("Média do 1° aluno: "+mediaAluno1/4);
        System.out.println("");
        double notasAluno2[] = new double[4];
        for (int i = 0; i < notasAluno2.length; i++) {System.out.println("Nota "+(i+1)+" do 2° aluno: "); notasAluno2[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno2 = 0;
        for (int i = 0; i < notasAluno2.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno2[i]); mediaAluno2+=notasAluno2[i];}
        System.out.println("Média do 2° aluno: "+mediaAluno2/4);
        System.out.println("");
        double notasAluno3[] = new double[4];
        for (int i = 0; i < notasAluno3.length; i++) {System.out.println("Nota "+(i+1)+" do 3° aluno: "); notasAluno3[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno3 = 0;
        for (int i = 0; i < notasAluno3.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno3[i]); mediaAluno3+=notasAluno3[i];}
        System.out.println("Média do 3° aluno: "+mediaAluno3/4);
        System.out.println("");
        double notasAluno4[] = new double[4];
        for (int i = 0; i < notasAluno4.length; i++) {System.out.println("Nota "+(i+1)+" do 4° aluno: "); notasAluno4[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno4 = 0;
        for (int i = 0; i < notasAluno4.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno4[i]); mediaAluno4+=notasAluno4[i];}
        System.out.println("Média do 4° aluno: "+mediaAluno4/4);
        System.out.println("");
        double notasAluno5[] = new double[4];
        for (int i = 0; i < notasAluno5.length; i++) {System.out.println("Nota "+(i+1)+" do 5° aluno: "); notasAluno5[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno5 = 0;
        for (int i = 0; i < notasAluno5.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno5[i]); mediaAluno5+=notasAluno5[i];}
        System.out.println("Média do 5° aluno: "+mediaAluno5/4);
        System.out.println("");
        double notasAluno6[] = new double[4];
        for (int i = 0; i < notasAluno6.length; i++) {System.out.println("Nota "+(i+1)+" do 6° aluno: "); notasAluno6[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno6 = 0;
        for (int i = 0; i < notasAluno6.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno6[i]); mediaAluno6+=notasAluno6[i];}
        System.out.println("Média do 6° aluno: "+mediaAluno6/4);
        System.out.println("");
        double notasAluno7[] = new double[4];
        for (int i = 0; i < notasAluno7.length; i++) {System.out.println("Nota "+(i+1)+" do 7° aluno: "); notasAluno7[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno7 = 0;
        for (int i = 0; i < notasAluno7.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno7[i]); mediaAluno7+=notasAluno7[i];}
        System.out.println("Média do 7° aluno: "+mediaAluno7/4);
        System.out.println("");
        double notasAluno8[] = new double[4];
        for (int i = 0; i < notasAluno8.length; i++) {System.out.println("Nota "+(i+1)+" do 8° aluno: "); notasAluno8[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno8 = 0;
        for (int i = 0; i < notasAluno8.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno8[i]); mediaAluno8+=notasAluno8[i];}
        System.out.println("Média do 8° aluno: "+mediaAluno8/4);
        System.out.println("");
        double notasAluno9[] = new double[4];
        for (int i = 0; i < notasAluno9.length; i++) {System.out.println("Nota "+(i+1)+" do 9° aluno: "); notasAluno9[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno9 = 0;
        for (int i = 0; i < notasAluno9.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno9[i]); mediaAluno9+=notasAluno9[i];}
        System.out.println("Média do 9° aluno: "+mediaAluno9/4);
        System.out.println("");
        double notasAluno10[] = new double[4];
        for (int i = 0; i < notasAluno10.length; i++) {System.out.println("Nota "+(i+1)+" do 10° aluno: "); notasAluno10[i] = scan.nextInt();}
        System.out.println("");
        double mediaAluno10 = 0;
        for (int i = 0; i < notasAluno10.length; i++) {System.out.println("Nota "+(i+1)+": "+notasAluno10[i]); mediaAluno10+=notasAluno10[i];}
        System.out.println("Média do 10° aluno: "+mediaAluno10/4);
        System.out.println("");
        mediaAluno1=(mediaAluno1/4);
        mediaAluno2=(mediaAluno2/4);
        mediaAluno3=(mediaAluno3/4);
        mediaAluno4=(mediaAluno4/4);
        mediaAluno5=(mediaAluno5/4);
        mediaAluno6=(mediaAluno6/4);
        mediaAluno7=(mediaAluno7/4);
        mediaAluno8=(mediaAluno8/4);
        mediaAluno9=(mediaAluno9/4);
        mediaAluno10=(mediaAluno10/4);
        mediasAlunos[0] = (mediaAluno1);
        mediasAlunos[1] = (mediaAluno2);
        mediasAlunos[2] = (mediaAluno3);
        mediasAlunos[3] = (mediaAluno4);
        mediasAlunos[4] = (mediaAluno5);
        mediasAlunos[5] = (mediaAluno6);
        mediasAlunos[6] = (mediaAluno7);
        mediasAlunos[7] = (mediaAluno8);
        mediasAlunos[8] = (mediaAluno9);
        mediasAlunos[9] = (mediaAluno10);
        System.out.println("Alunos aprovados:");
        for (int i = 0; i < alunosCadastrados.length; i++) {if (mediasAlunos[i]>=7.0){System.out.println("Aluno "+(i+1)+"\nMédia: "+mediasAlunos[i]);}}
    }
    public void exercicio6correcao() {
        double mediasAlunos[]=new double[10];
        double notasAlunos[]=new double[4];
        int cont = 0;
        for (int i = 0; i < mediasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.println("Informe a nota "+(j+1)+" do aluno "+(i+1)+": ");
                notasAlunos[j]=scan.nextDouble();
                mediasAlunos[i]+=notasAlunos[j];
            }
            mediasAlunos[i]/=notasAlunos.length;
            if (mediasAlunos[i]>=7){cont++;}
        }
        for (int i = 0; i < mediasAlunos.length; i++) {
            System.out.println("A média do aluno "+(i+1)+" é: "+mediasAlunos[i]);
        }
        System.out.println("O número de alunos aprovados é: "+cont);

    }
    public void exercicio7() {
        System.out.println("");
        System.out.println("Exercício 7");
        System.out.println("");
        int numerosOperacao[]=new int[]{2,3,4,5,6};
        System.out.println("Soma: "+(numerosOperacao[0]+numerosOperacao[1]+numerosOperacao[2]+numerosOperacao[3]+numerosOperacao[4]));
        System.out.println("Multiplicação: "+(numerosOperacao[0]*numerosOperacao[1]*numerosOperacao[2]*numerosOperacao[3]*numerosOperacao[4]));
        System.out.println("Números:");
        for (int i = 0; i < numerosOperacao.length; i++) {System.out.println(+numerosOperacao[i]);}
    }
    public void exercicio8() {
        System.out.println("");
        System.out.println("Exercício 8");
        System.out.println("");
        int pessoasInseridas[]=new int[5];
        double alturasInseridas[]=new double[5];
        int pesosInseridos[]=new int [5];
        for (int i = 0; i < pessoasInseridas.length; i++) {System.out.println("Pessoa "+(i+1));System.out.println("Insira a altura: ");alturasInseridas[i]=scan.nextDouble();System.out.println("");System.out.println("Insira o peso: ");pesosInseridos[i]=scan.nextInt();System.out.println("");}
        System.out.println("=============================================================================");
        System.out.println("");
        System.out.println("Pessoa 1:\nAltura: "+alturasInseridas[0]+"\nPeso: "+pesosInseridos[0]+"\n\nPessoa 2:\nAltura: "+alturasInseridas[1]+"\nPeso: "+pesosInseridos[1]+"\n\nPessoa 3:\nAltura: "+alturasInseridas[2]+"\nPeso: "+pesosInseridos[2]+"\n\nPessoa 4:\nAltura: "+alturasInseridas[3]+"\nPeso: "+pesosInseridos[3]+"\n\nPessoa 5:\nAltura: "+alturasInseridas[4]+"\nPeso: "+pesosInseridos[4]);
    }
    public void exercicio9() {
        System.out.println("");
        System.out.println("Exercício 9");
        System.out.println("");
        int vetorA[]=new int[]{2,4,6,8,10,12,14,16,18,20};
        for (int i = 0; i < vetorA.length; i++) {System.out.println("Número "+vetorA[(i+1)]+": "+(vetorA[i]*vetorA[i]));}

    }
}