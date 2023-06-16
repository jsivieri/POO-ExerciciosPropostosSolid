package ocp;

abstract class Desconto {
    public abstract double calcularDesconto(double preco);
}

class DescontoFixo extends Desconto {
    private double valorDesconto;

    public DescontoFixo(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public double calcularDesconto(double preco) {
        return preco - valorDesconto;
    }
}