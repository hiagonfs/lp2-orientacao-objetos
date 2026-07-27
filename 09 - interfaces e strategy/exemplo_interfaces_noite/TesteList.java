package interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TesteList {

	public static void main(String[] args) {

		// programe para abstracao, nao para implementacao
		List<String> palavras = new ArrayList<>();

		// forma errada de fazer: EVITE!!!
		ArrayList<String> palavras2 = new ArrayList<>();

		palavras = new LinkedList<>();

		palavras.add("Oi");
		palavras.add("Outra");
		palavras.add("Palavra");

		palavras = new Vector<String>();

		palavras.add("Oi");
		palavras.add("Outra");
		palavras.add("Palavra");

		for (String p : palavras) {
			System.out.println(p);
		}

	}

}
