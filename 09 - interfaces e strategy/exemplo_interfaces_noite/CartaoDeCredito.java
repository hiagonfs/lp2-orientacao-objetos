package interfaces;

public class CartaoDeCredito implements Pagavel {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagando com cartão o valor de " + valor);
	}

}
