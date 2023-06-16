package ocp;

class DescontoPercentual extends Desconto {
    private double percentualDesconto;

    public DescontoPercentual(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public double calcularDesconto(double preco) {
        double desconto = (percentualDesconto / 100) * preco;
        return preco - desconto;
    }
}