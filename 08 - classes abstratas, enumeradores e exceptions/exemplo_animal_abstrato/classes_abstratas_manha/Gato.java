package classes_abstratas_manha;

public class Gato extends Animal {

	public Gato(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está miando: Miau!");
	}

}
