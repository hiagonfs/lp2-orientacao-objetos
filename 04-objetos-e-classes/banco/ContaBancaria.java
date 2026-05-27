public class ContaBancaria {

	int numero;
	String titular;
	double saldo;

	ContaBancaria(int numero, String titular, double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	ContaBancaria(String titular) {
		this.titular = titular;
	}

	boolean possuiSaldoMaiorQue(double valor) {
		return saldo > valor;
	}

	public String toString() {
		String contaInfo = numero + " | " + titular + " | " + saldo;
		return contaInfo;
	}

}