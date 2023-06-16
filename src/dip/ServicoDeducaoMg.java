package dip;

class ServicoDeducaoMg implements ServicoDeducao {
    @Override
    public double calcularDeducao(double valor) {
        return valor * 0.12;
    }
}
