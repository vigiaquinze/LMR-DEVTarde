package POOHeranca.People;

public class Alunos extends Pessoas {
    String turma;
    int nMatricula;
    String ra;
    String telefoneResponsavel;
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getTelefoneResponsavel() {
        return telefoneResponsavel;
    }
    public void setTelefoneResponsavel(String telefoneResponsavel) {
        this.telefoneResponsavel = telefoneResponsavel;
    }
    @Override
    public void setRg() {
        this.rg="SP"+"numero";
    }
    
}
