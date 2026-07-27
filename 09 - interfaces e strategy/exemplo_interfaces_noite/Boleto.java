package interfaces;

public class Boleto implements Pagavel {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagando com boleto o valor de: " + valor);
	}

}
