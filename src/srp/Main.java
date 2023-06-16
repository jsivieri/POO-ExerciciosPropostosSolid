package srp;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça", 59.99);
        Produto p3 = new Produto("Tênis", 99.99);

        
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.addItem(p1, 2);
        carrinho.addItem(p2, 1);
        carrinho.addItem(p3, 3);

        
        carrinho.calcularPrecoTotal();

        
        Pagamento pagamento = new Pagamento(carrinho);
        pagamento.processaPagamento();

        
        ConfirmacaoEmail confirmacaoEmail = new ConfirmacaoEmail(pagamento);
        confirmacaoEmail.enviarEmailConfirmacao();
    }
}
