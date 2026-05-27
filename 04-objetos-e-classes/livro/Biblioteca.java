public class Biblioteca {

	Livro[] livros;

	Biblioteca(int capacidadeDeLivros) {
		livros = new Livro[capacidadeDeLivros];
	}

	void adicionarNovoLivro(String titulo, String autor, int ano, double preco) {
		// [null, null, null, null...]

		Livro novoLivro = new Livro(titulo, autor, preco, ano);

		for (int i = 0; i < livros.length; i++) {
			if (livros[i] == null) {
				livros[i] = novoLivro;
			}
		}
	}

}