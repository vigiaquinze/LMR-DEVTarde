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
        return saldoContaJuridica;
    }

    public void setSaldoContaJuridica(int saldoContaJuridica) {
        this.saldoContaJuridica = saldoContaJuridica;
    }
    
}
