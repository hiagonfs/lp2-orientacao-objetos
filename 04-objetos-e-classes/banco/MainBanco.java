import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o codigo bancario: ");
		int codigoBancario = leitor.nextInt();

		Banco bank = new Banco(codigoBancario);

		System.out.println("Digite as infos da conta: ");
		int numeroDaConta = leitor.nextInt();
		String titular = leitor.next();
		double saldoDaConta = leitor.nextDouble();

		bank.adicionarConta(numeroDaConta, titular, saldoDaConta);

		System.out.println("Digite o valor do saldo minimo");
		double valorMinimoSaldo = leitor.nextDouble();

		bank.contasComSaldoMaiorQue(valorMinimoSaldo);

	}

}