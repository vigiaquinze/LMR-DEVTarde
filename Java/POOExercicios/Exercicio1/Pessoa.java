package POOExercicios.Exercicio1;

public class Pessoa {
    String nome;
    double altura;
    int diaDeNascimento;
    int mesDeNascimento;
    int anoDeNascimento;
    
    public Pessoa(String nome, double altura, int diaDeNascimento, int mesDeNascimento, int anoDeNascimento) {
        this.nome = nome;
        this.altura = altura;
        this.diaDeNascimento = diaDeNascimento;
        this.mesDeNascimento = mesDeNascimento;
        this.anoDeNascimento = anoDeNascimento;
    }
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
    public int getDiaDeNascimento() {
        return diaDeNascimento;
    }
    public void setDiaDeNascimento(int diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }
    public int getMesDeNascimento() {
        return mesDeNascimento;
    }
    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }
    public void idade(){
        int idade;
        if(diaDeNascimento<30 && mesDeNascimento<=5) {idade = 2023-anoDeNascimento;}
        else{idade=2023-anoDeNascimento-1;}
        System.out.println("Idade: "+idade+" anos");
    }
    
}
