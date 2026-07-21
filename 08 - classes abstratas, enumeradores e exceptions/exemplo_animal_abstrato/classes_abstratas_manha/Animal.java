package classes_abstratas_manha;

public abstract class Animal {

	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public abstract void emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String novoNome) throws Exception {
		this.nome = novoNome;
	}

	public int getIdade() {
		return idade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + " | Idade: " + idade;
	}
}
