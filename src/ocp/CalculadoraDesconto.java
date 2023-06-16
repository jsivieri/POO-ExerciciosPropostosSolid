package ocp;

class CalculadoraDesconto {
    public double aplicarDesconto(Produtos produtos, Desconto desconto) {
        double preco = produtos.getPreco();
        double precoComDesconto = desconto.calcularDesconto(preco);
        return precoComDesconto;
    }
}
