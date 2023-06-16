package ocp;

public class Main {
    public static void main(String[] args) {
        
        Produtos produto1 = new Produtos("Camiseta", 50.0);
        Produtos produto2 = new Produtos("Calça", 100.0);
    	
        Desconto descontoFixo = new DescontoFixo(10.0);
        Desconto descontoPercentual = new DescontoPercentual(20.0);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();
        double precoComDesconto1 = calculadora.aplicarDesconto(produto1, descontoFixo);
        double precoComDesconto2 = calculadora.aplicarDesconto(produto2, descontoPercentual);

 
        System.out.println("Preço do produto 1 com desconto: " + precoComDesconto1);
        System.out.println("Preço do produto 2 com desconto: " + precoComDesconto2);
    }
}