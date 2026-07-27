package interfaces;

public class Pix implements Pagavel {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagando com Pix o valor de: " + valor);
	}

}
