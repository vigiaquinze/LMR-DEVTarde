package Colecoes;

import java.util.ArrayList;

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
        //limpando a lista
        carros.clear();
        System.out.println(carros);
    }
}
