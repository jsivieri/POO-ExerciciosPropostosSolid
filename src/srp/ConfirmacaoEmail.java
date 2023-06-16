package srp;

public class ConfirmacaoEmail {
    private Pagamento pagamento;

    public ConfirmacaoEmail(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void enviarEmailConfirmacao() {
        if (pagamento.getCarrinhoCompras().isPago()) {
            System.out.println("Email de confirmação enviado.");
        } else {
            System.out.println("O pagamento não foi realizado. Não é possível enviar o email de confirmação.");
        }
    }
}