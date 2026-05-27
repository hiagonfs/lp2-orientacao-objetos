public class Pessoa {

	String nome;
	int idade;
	
	// sobrecarga de construtores
	Pessoa(String nome) {
		this.nome = nome; 
	}
	
	Pessoa() {
		this.nome = "";
		this.idade = -1; 
	}
	
	Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade; 
	}

}