import java.util.Scanner;

public class ContadorRegressivoRecursivo {

	static void contadorRegressivoRecursivo(int valor) {
		if (valor == 0) {
			System.out.println(0);
		} else {
			System.out.println(valor);
			contadorRegressivoRecursivo(valor - 1);
		}
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um valor");
		int numero = leitor.nextInt();

		contadorRegressivoRecursivo(numero);

	}

}
