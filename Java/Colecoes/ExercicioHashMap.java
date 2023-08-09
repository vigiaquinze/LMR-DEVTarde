package Colecoes;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ExercicioHashMap {
    HashMap<String,String> idadeNome = new HashMap<>();
    public void exercicio1() {
            idadeNome.put(JOptionPane.showInputDialog("Digite sua idade"), JOptionPane.showInputDialog("Digite seu nome"));
            for (String i : idadeNome.keySet()) {
                System.out.println(i+": "+idadeNome.get(i));
            }
    }
}
