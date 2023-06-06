package POOExercicios.Exercicio2;

import javax.swing.JOptionPane;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        //criar um vetor para 10 objetos
        BuscarPessoa contatos[] = new BuscarPessoa[10];
        Random rndm = new Random();
        //criar os objetos e preencher os atributos do objeto
        for (int i = 0; i < contatos.length; i++) {
            //criar o objeto com o construtor
            contatos[i] = new BuscarPessoa();
            //preencher os atributos (set)
            contatos[i].setNome(JOptionPane.showInputDialog("Digite o nome: "));
            contatos[i].setAltura(rndm.nextDouble(1.5,2));
            contatos[i].setIdade(i+18);
        }
        String buscarNome = JOptionPane.showInputDialog("Digite o nome a ser buscado: ");
        boolean busca = true;
        int cont = 0;
        while (busca){
            if (buscarNome.equals(contatos[cont].getNome())){
                busca=false;
                contatos[cont].imprimir();
            }
            cont++;
        }
    }
}
