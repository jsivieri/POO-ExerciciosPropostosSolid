package lsp;

public class Main {
    public static void main(String[] args) {
        
        Produto produto1 = new ProdutoCartaoCredito("Camiseta", 50.0);
        Produto produto2 = new ProdutoBoletoBancario("Calça", 100.0);
        Produto produto3 = new ProdutoTransferenciaBancaria("Tênis", 200.0);

        
        Produto[] produtos = {produto1, produto2, produto3};

        for (Produto produto : produtos) {
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Forma de Pagamento: " + produto.formaPagamento());
            System.out.println();
        }
    }
}
