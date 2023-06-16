package dip;

class ServicoDeducaoSp implements ServicoDeducao {
    @Override
    public double calcularDeducao(double valor) {
        return valor * 0.10;
    }
}
