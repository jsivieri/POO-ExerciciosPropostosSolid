package dip;

public class Main {
    public static void main(String[] args) {
        double valor = 1000.00;

        ServicoDeducao servicoDeducao = new ServicoDeducaoMg();
        ServicoPagamento servicoPagamento = new ServicoPagamento(servicoDeducao);

        double deducao = servicoDeducao.calcularDeducao(valor);
        double imposto = servicoPagamento.calcularImposto(valor);

        System.out.println("Valor: " + valor);
        System.out.println("Taxa de dedução de impostos: 12% (MG)");
        System.out.println("Dedução: " + deducao);
        System.out.println("Imposto devido: " + imposto);

        System.out.println();

        servicoDeducao = new ServicoDeducaoSp();
        servicoPagamento = new ServicoPagamento(servicoDeducao);

        deducao = servicoDeducao.calcularDeducao(valor);
        imposto = servicoPagamento.calcularImposto(valor);

        System.out.println("Valor: " + valor);
        System.out.println("Taxa de dedução de impostos: 10% (SP)");
        System.out.println("Dedução: " + deducao);
        System.out.println("Imposto devido: " + imposto);
    }
}