import java.util.Scanner;

public class MetodoBasico {

	// definicao do metodo exibeResultado
	static void exibeResultado(int resultado) {
		System.out.println(resultado);
	}

	// definicao do metodo de soma
	static int soma(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int numero1, numero2;

		// leitura de dados do tipo int
		numero1 = leitor.nextInt();

		// leitura de dados do tipo int
		numero2 = leitor.nextInt();

		// chamada do metodo de soma
		int resultado = soma(numero1, numero2);

		// chamada do metodo exibe resultado
		exibeResultado(resultado);

		leitor.close();

	}

}