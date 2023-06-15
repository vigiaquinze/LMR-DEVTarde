package ProjetoFinalJAVA;

public class PessoaJuridica extends Pessoa{
    String cnpj;
    int saldoContaJuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getSaldoContaJuridica() {
        return 1;
    }

    public void setSaldoContaJuridica(int saldoContaJuridica) {
        this.saldoContaJuridica = saldoContaJuridica;
    }

    public PessoaJuridica(int saldoContaJuridica) {
        this.saldoContaJuridica = saldoContaJuridica;
    }
    
}
