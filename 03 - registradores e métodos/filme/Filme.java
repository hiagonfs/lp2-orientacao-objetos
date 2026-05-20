public class Filme {

    // atributos - sempre utilizar substantivos 
	String titulo;
	int anoLancamento;
	int duracaoEmMinutos;

    // métodos -> ações: sempre usar verbos
	void exibirDuracaoEmHoras() {
		// feio
		// System.out.println(duracaoEmMinutos/60);
		int duracaoEmHoras = duracaoEmMinutos / 60;
		System.out.println(duracaoEmHoras);
	}

}