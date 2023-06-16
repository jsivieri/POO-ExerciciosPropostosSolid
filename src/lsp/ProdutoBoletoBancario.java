package lsp;

class ProdutoBoletoBancario extends Produto {
    public ProdutoBoletoBancario(String descricao, double preco) {
        super(descricao, preco);
    }

    public String formaPagamento() {
        return "Boleto Bancário";
    }
}
