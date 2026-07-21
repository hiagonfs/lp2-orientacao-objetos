package classes_abstratas_manha;

public class Cachorro extends Animal {

	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está latindo: Au au!");
	}

}
