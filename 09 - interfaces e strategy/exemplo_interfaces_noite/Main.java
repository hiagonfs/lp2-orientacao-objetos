package interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// contrato da interface
		Pagavel pagamento = new Pix();

		pagamento.processarPagamento(20);

		pagamento = new Boleto();

		pagamento.processarPagamento(35);

		pagamento = new CartaoDeCredito();
		
		pagamento.processarPagamento(15);
		
		ArrayList<Pagavel> pagamentos;

	}

}
