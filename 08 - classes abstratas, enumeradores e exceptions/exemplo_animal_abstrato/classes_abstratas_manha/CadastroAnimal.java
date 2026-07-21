package classes_abstratas_manha;

import java.util.ArrayList;

public class CadastroAnimal {

	private ArrayList<Animal> animais;

	public CadastroAnimal() {
		animais = new ArrayList<Animal>();
	}

	public ArrayList<Gato> buscarGatos() {
		ArrayList<Gato> gatosEncontrados = new ArrayList<Gato>();

		for (Animal animal : animais) {
			if (animal instanceof Gato) {
				Gato gato = (Gato) animal;
				gatosEncontrados.add(gato);
			}
		}

		return gatosEncontrados;
	}

	public void todosEmitiremSom() {
		for (Animal animal : animais) {
			animal.emitirSom();
		}
	}

	public void listarAnimais() {
		for (Animal animal : animais) {
			System.out.println(animal);
		}
	}

	public int getQuantidadeAnimais() {
		return animais.size();
	}

	public boolean cadastrarCachorro(String nome, int idade, String raca) {
		Cachorro novoCachorro = new Cachorro(nome, idade, raca);
		return animais.add(novoCachorro);

	}

	public boolean cadastrarGato(String nome, int idade) {
		Gato novoGato = new Gato(nome, idade);
		return animais.add(novoGato);
	}

	public int getMediaIdadeAnimal() {
		int somaIdade = 0;
		for (Animal animal : animais) {
			somaIdade += animal.getIdade();
		}
		int media = somaIdade / animais.size();
		return media;
	}
}
