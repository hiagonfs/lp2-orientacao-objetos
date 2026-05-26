public class MainProduto {

	public static void main(String[] args) {

		// referencia
		Produto prod = new Produto();

		prod.nome = "Sabonete";
		prod.preco = 20;
		prod.qtdEmEstoque = 5;

		double valorTotal = prod.calculaValorTotalEmEstoque();

		System.out.println(valorTotal);

	}

}