public class Produto {

	// atributos - substantivos
	String nome;
	double preco;
	int qtdEmEstoque;

	// calcula o valor total em estoque
	// nome: verbos
	double calculaValorTotalEmEstoque() {
		return preco * qtdEmEstoque;
	}

}
