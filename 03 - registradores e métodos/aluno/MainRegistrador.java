import java.util.Scanner;

public class MainRegistrador {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// referencia
		Aluno aluno1 = new Aluno();

		// usando a referencia
		aluno1.nome = leitor.next();

		// leitura de dados com scanner
		aluno1.nota = leitor.nextDouble();

		System.out.println(aluno1);

		System.out.println(aluno1.nome);
		System.out.println(aluno1.nota);

		// copia de referencia
		Aluno aluno2 = aluno1;

		System.out.println(aluno2.nome);
		System.out.println(aluno2.nota);

		aluno1.nome = "Outro nome";

		System.out.println(aluno1.nome);
		System.out.println(aluno2.nome);

	}

}
