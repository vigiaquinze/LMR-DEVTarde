package CalculadoraGastoViagem;

public class CustoViagem {
    public static void main(String[] args) {
        //Teste de versionamento
        //Usuário definir a distância percorrida pela viagem
        double distanciaPercorrida = 148;
        //Usuário definir o valor do combustível por litro
        double preçoCombustivel = 5.10;
        //Usuário definir quanto o carro consume por quilômetro
        double consumoCarro = 8;
        //Divir o consumo por quilômetro pela distância
        double consumoTotal = distanciaPercorrida / consumoCarro;
        //Multiplicar o resultado do item 4 pelo preço do combustível
        double custoTotal = consumoTotal * preçoCombustivel;
        //Mostre o gasto total da viagem
        System.out.println("O gasto total da viagem foi de R$"+custoTotal+"");
    }
}
