package controlador;

import classes_abstratas_manha.CadastroAnimal;

public class ControladorCadastroAnimal {

	private CadastroAnimal cadastroAnimal;

	public ControladorCadastroAnimal() {
		this.cadastroAnimal = new CadastroAnimal();
	}

	public boolean cadastraCachorro(String nome, int idade, String raca) {
		return cadastroAnimal.cadastrarCachorro(nome, idade, raca);
	}

	public int getQuantidadeAnimais() {
		return cadastroAnimal.getQuantidadeAnimais();
	}

	public int getMediaIdadeAnimal() {
		return cadastroAnimal.getMediaIdadeAnimal();
	}

}
