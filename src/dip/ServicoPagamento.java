package dip;

class ServicoPagamento {
    private ServicoDeducao servicoDeducao;

    public ServicoPagamento(ServicoDeducao servicoDeducao) {
        this.servicoDeducao = servicoDeducao;
    }

    public double calcularImposto(double valor) {
        double deducao = servicoDeducao.calcularDeducao(valor);
        double valorRestante = valor - deducao;
        return valorRestante * 0.20;
    }
}
