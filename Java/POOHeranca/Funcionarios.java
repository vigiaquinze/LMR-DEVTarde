package POOHeranca;

public class Funcionarios extends Pessoas {
    String funcao;
    int salario;
    int nCracha;
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getnCracha() {
        return nCracha;
    }
    public void setnCracha(int nCracha) {
        this.nCracha = nCracha;
    }
    
}
