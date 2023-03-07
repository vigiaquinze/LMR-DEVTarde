package CalculadoraDeDesconto;

public class CalcularDesconto {
    
    public void calcular20() {
        System.out.println("===================");
        //Altere o valor da variável abaixo para realizar testes
        double precoProduto;
        precoProduto = 200;
        System.out.println("O preço do produto é de R$"+precoProduto+".");
        double percentualDesconto = 10.0;
        percentualDesconto = 20;
        System.out.println("O desconto será de "+percentualDesconto+"%");
        //Regra de três para descobrir o valor do produto
        double desconto = precoProduto*percentualDesconto/100;
        //Preço do produto menos o desconto para sabermos o valor do produto com o desconto que foi calculado
        double precoComDesconto = precoProduto-desconto;
        System.out.println("O valor do produto com o desconto aplicado é de R$"+precoComDesconto+".");
        System.out.println("Fim!");
        System.out.println("======================");
    }

    public void calcular30() {
        System.out.println("===================");
        //Altere o valor da variável abaixo para realizar testes
        double precoProduto;
        precoProduto = 200;
        System.out.println("O preço do produto é de R$"+precoProduto+".");
        double percentualDesconto = 10.0;
        percentualDesconto = 30;
        System.out.println("O desconto será de "+percentualDesconto+"%");
        //Regra de três para descobrir o valor do produto
        double desconto = precoProduto*percentualDesconto/100;
        //Preço do produto menos o desconto para sabermos o valor do produto com o desconto que foi calculado
        double precoComDesconto = precoProduto-desconto;
        System.out.println("O valor do produto com o desconto aplicado é de R$"+precoComDesconto+".");
        System.out.println("Fim!");
        System.out.println("======================");
    }
}
