package Model;

public class Carros {
    //atributos
    private String marca;
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    private String preco;
    //métodos
    public Carros(String marca, String modelo, String ano, String cor, String placa, String preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
        this.preco = preco;
    }
    //getters and setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPreco() {
        return preco;
    }
    public void setPreco(String Preco) {
        this.preco = preco;
    }
    
}
