public class Banco {

	int codigoBancario;
	// composição de objetos 
	ContaBancaria[] contas;

	Banco(int codigoBancario) {
		this.codigoBancario = codigoBancario;
		this.contas = new ContaBancaria[0];
	}

	void adicionarConta(int numero, String titular, double saldo) {

		// criar uma conta nova
		// aumentar o tamanho do vetor pra receber a nova conta
		// copiar do antigo pro novo
		// colocar a conta no vetor

		ContaBancaria novaConta = new ContaBancaria(numero, titular, saldo);

		ContaBancaria[] contasAux = new ContaBancaria[this.contas.length + 1];

		for (int i = 0; i < this.contas.length; i++) {
			contasAux[i] = contas[i];
		}

		contasAux[contasAux.length - 1] = novaConta;

		contas = contasAux;

	}

	void contasComSaldoMaiorQue(double valorMinimoSaldo) {
		// percorrer as contas e printar as que possuem saldo maior que valorMinimo

		for (ContaBancaria minhaConta : contas) {
			if (minhaConta.possuiSaldoMaiorQue(valorMinimoSaldo)) {
				System.out.println(minhaConta);
			}

		}

	}

}