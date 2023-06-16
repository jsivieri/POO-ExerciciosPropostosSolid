package srp;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoCompras {
    private Map<Produto, Integer> carrinho;

    public CarrinhoCompras() {
        carrinho = new HashMap<>();
    }
    
    

    public Map<Produto, Integer> getCarrinho() {
		return carrinho;
	}



	public void setCarrinho(Map<Produto, Integer> carrinho) {
		this.carrinho = carrinho;
	}



	public void addItem(Produto produto, int quantidade) {
        carrinho.put(produto, quantidade);
    }

    public void removeItem(Produto produto) {
        carrinho.remove(produto);
    }

    public void calcularPrecoTotal() {
        double precoTotal = 0;
        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
            Produto produto = entry.getKey();
            int quantidade = entry.getValue();
            precoTotal += produto.getPreco() * quantidade;
        }
        System.out.println("Preço total do carrinho: " + precoTotal);
    }



	public void setPago(boolean b) {
		// TODO Auto-generated method stub
		
	}



	public boolean isPago() {
		// TODO Auto-generated method stub
		return false;
	}
}