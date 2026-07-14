public class Main {
	
	static int soma(int valor1, int valor2) {
		return valor1 + valor2; 
	}

	public static void main(String[] args) {

		// p é um objeto do tipo Pessoa
		Pessoa p = new Pessoa();

		// bis é um objeto do tipo Biscoito
		Biscoito bis = new Biscoito();

		Calculadora calc = new Calculadora(3, 5);

		// acessando atributo
		System.out.println(calc.numero1);

		// acessando método
		System.out.println(calc.soma());
		
		Pessoa p1 = new Pessoa("Hiago", 30); 

	}

}