package POOExercicios.Exercicio2;

import javax.swing.JOptionPane;

public class BuscarPessoa {
    //atributos
    String nome;
    double altura;
    int idade;
    //métodos
    //construtor com parâmetros
    public BuscarPessoa(String nome, double altura, int idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }
    //construtor vazio
    public BuscarPessoa() {
    }

    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    //métodos de aplicação diversas
    //imprimir (void)
    public void imprimir() {
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nAltura: "+altura+"m\nIdade: "+idade+" anos.");
    }
}
