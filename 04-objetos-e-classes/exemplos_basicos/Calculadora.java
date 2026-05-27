public class Calculadora {

	int numero1;
	int numero2;

	// Método Construtor
	Calculadora(int valor1, int valor2) {
		numero1 = valor1;
		numero2 = valor2;
	}

	// métodos da classe Calculadora
	int soma() {
		return numero1 + numero2;
	}

	// sobrecarga de método
	int soma(int v1, int v2) {
		return v1 + v2;
	}

	double soma(double v1, int v2) {
		return v1 + v2;
	}

}
