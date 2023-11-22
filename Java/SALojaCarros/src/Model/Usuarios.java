package Model;

public class Usuarios {
    // atributos
    private String nome;
    private String cpf;
    // métodos
    public Usuarios(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    //gets and sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
