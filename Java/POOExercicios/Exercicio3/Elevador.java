package POOExercicios.Exercicio3;

public class Elevador {
    //atributos
    int nMaxAndares;
    int nMaxPessoas;
    int andarAtual;
    int qtdPessoasAtual;
    //métodos
    //construtor
    public Elevador(int nMaxAndares, int nMaxPessoas) {
        this.nMaxAndares = nMaxAndares;
        this.nMaxPessoas = nMaxPessoas;
    }
    //gets and sets
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }
    public int getQtdPessoasAtual() {
        return qtdPessoasAtual;
    }
    public void setQtdPessoasAtual(int qtdPessoasAtual) {
        this.qtdPessoasAtual = qtdPessoasAtual;
    }
    //métodos próprios
    public void inicializa() {
        andarAtual=0;
        qtdPessoasAtual=0;
    }
    public int entra() {
        if(qtdPessoasAtual<nMaxPessoas)
        {qtdPessoasAtual++;}
        else{System.out.println("Capacidade máxima do elevador atingida.");}
        return qtdPessoasAtual;
    }
    public int sai() {
        if(qtdPessoasAtual>0)
        {qtdPessoasAtual--;}
        else{System.out.println("Não há ninguém para descer.");}
        return qtdPessoasAtual;
    }
    public int sobe(int nAndares) {
        if(andarAtual+nAndares<=nMaxAndares)
        {andarAtual+=nAndares;}
        else{System.out.println("Digite um número dentro do escopo de andares");};
        return andarAtual;
    }
    public int desce(int nAndares) {
        if(andarAtual-nAndares>=0)
        {andarAtual-=nAndares;}
        else{System.out.println("Digite um número dentro do escopo de andares");};
        return andarAtual;
    }
}
