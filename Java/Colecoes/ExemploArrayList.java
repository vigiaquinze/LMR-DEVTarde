package Colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class ExemploArrayList {
    public void teste(){
        ArrayList <String> carros = new ArrayList<>();
        carros.add("Fusca");
        carros.add("Monza");
        carros.add("Chevette");
        carros.add("Brasília");
        carros.add("Gol");
        carros.add("Corsa");
        //imprimindo a lista completa
        System.out.println(carros);
        //percorrer a lista com for
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }
        for (String foreach : carros) {
            System.out.println(foreach);
        }
        //ordenando a lista
        Collections.sort(carros);
        System.out.println(carros);
        //ordenando a lista em modo reverso
        Collections.reverse(carros);
        System.out.println(carros);
        //limpando a lista
        carros.clear();
        System.out.println(carros);
    }
    public void exercicio1(){
        //criar um arraylist de números inteiros
        //escrever cinco números aleatórios - ordenar e imprimir
        ArrayList <Integer> numerosInteiros = new ArrayList<>();
        numerosInteiros.add(15);
        numerosInteiros.add(30);
        numerosInteiros.add(45);
        numerosInteiros.add(27);
        numerosInteiros.add(01);
        System.out.println(numerosInteiros);
        Collections.sort(numerosInteiros);
        System.out.println(numerosInteiros);
    }
}
