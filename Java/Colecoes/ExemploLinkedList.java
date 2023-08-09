package Colecoes;

import java.util.LinkedList;

public class ExemploLinkedList {
    LinkedList <String> pessoas = new LinkedList<>();
    public void teste2() {
        pessoas.add("Pedro");
        pessoas.add("Maria");
        pessoas.add("João");
        //na primeira posição
        pessoas.addFirst("Cecília");
        //remove o último
        pessoas.removeLast();
        //imprime a lista
        System.out.println(pessoas);
    }
}
