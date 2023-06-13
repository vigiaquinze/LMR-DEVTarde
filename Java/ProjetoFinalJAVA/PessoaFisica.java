package ProjetoFinalJAVA;

public class PessoaFisica extends Pessoa{
    String cpf;
    String dataNascimento;
    int saldoContaFisica;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public int getSaldoContaFisica() {
        return saldoContaFisica;
    }
    public void setSaldoContaFisica(int saldoContaFisica) {
        this.saldoContaFisica = saldoContaFisica;
    }
    
}
