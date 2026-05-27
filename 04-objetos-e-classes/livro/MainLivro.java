import java.util.Scanner;

public class MainLivro {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		String titulo = leitor.next();
		String autor = leitor.next();
		int anoPublicacao = leitor.nextInt();
		double preco = leitor.nextDouble();
		
		Livro novoLivro = new Livro(titulo, autor, preco, anoPublicacao);
		
		novoLivro.exibirDados();

	}

}
