public class Livro {

	String titulo;
	String autor;
	double preco;
	int anoPublicacao;

	Livro(String titulo, String autor, double preco, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
		this.anoPublicacao = anoPublicacao;
	}

	void exibirDados() {
		System.out.println(titulo);
		System.out.println(autor);
		System.out.println(preco);
		System.out.println(anoPublicacao);
	}

	boolean ehAntigo() {
		// return anoPublicacao < 2000;
		if (anoPublicacao < 2000) {
			return true;
		}
		return false;
	}

}
