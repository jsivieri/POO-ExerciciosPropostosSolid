package srp;

public class Pagamento {
    private CarrinhoCompras carrinhoCompras;

    public Pagamento(CarrinhoCompras carrinhoCompras) {
        this.carrinhoCompras = carrinhoCompras;
    }
    
    

    public CarrinhoCompras getCarrinhoCompras() {
		return carrinhoCompras;
	}



	public void setCarrinhoCompras(CarrinhoCompras carrinhoCompras) {
		this.carrinhoCompras = carrinhoCompras;
	}



	public void processaPagamento() {
        carrinhoCompras.setPago(true);
    }
}