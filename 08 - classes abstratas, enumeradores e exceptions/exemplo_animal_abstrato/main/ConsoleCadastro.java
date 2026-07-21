package main;

import java.util.Scanner;

import controlador.ControladorCadastroAnimal;

public class ConsoleCadastro {

	private ControladorCadastroAnimal controladorCadastroAnimal;
	private Scanner leitor;

	public ConsoleCadastro() {
		this.controladorCadastroAnimal = new ControladorCadastroAnimal();
		this.leitor = new Scanner(System.in);
	}

	public void iniciar() {

		int opcao = leitor.nextInt();

		while (opcao != 0) {

			if (opcao == 5) {
				int mediaIdade = controladorCadastroAnimal.getMediaIdadeAnimal();
				System.out.println(mediaIdade);
			}

		}

	}

}
