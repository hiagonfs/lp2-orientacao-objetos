public class Entregador {

	String nome;
	String telefone;
	Pacote[] pacotes;
	int qtdPacotes;

	Entregador(String nome, String telefone, int qtdMaximaPacotes) {
		this.nome = nome;
		this.telefone = telefone;
		this.pacotes = new Pacote[qtdMaximaPacotes];
		this.qtdPacotes = 0;
	}

	Pacote buscarPacotePorCodigo(String codigo) {
        
        for (Pacote pacoteAtual : pacotes) {
            // compara o atributo codigo do objeto com o codigo recebido pelo método
            if (pacoteAtual.codigo.equalsIgnoreCase(codigo)) {
                // se os códigos forem iguais, encontramos o objeto procurado
                return pacoteAtual;
            }
        }
        
        // se o laço de repetição terminar e chegar até esta linha, significa que a condição do 'if' nunca foi verdadeira, logo o código não foi encontrado
        // retornamos 'null' para informar a quem chamou o método que nenhum objeto foi achado
        return null;
    }

	boolean removerPacotePorCodigo(String codigo) {
        
        //limitamos a busca apenas aos pacotes que realmente existem
        for (int i = 0; i < qtdPacotes; i++) {
            
            if (pacotes[i].codigo.equalsIgnoreCase(codigo)) {
                
                //se for encontrado, puxa os elementos da frente para ir 'tapando' o lugar que o removido deixará
                //o laço vai da posição encontrada (i) até a penultima posição logica que é qtdPacotes - 1.
                for (int j = i; j < qtdPacotes - 1; j++) {
                    pacotes[j] = pacotes[j + 1];
                }
                
                //como todos deram um passo para trás, o último pacote válido ficou duplicado
                //limpamos a última posição tirando a duplicação
                pacotes[qtdPacotes - 1] = null;
                
                //como removemos um elemento, a quantidade total diminui em 1
                qtdPacotes--; 
                
                return true; 
            }
        }
        
        return false; //retorno se o Pacote não foi encontrado.
    }

}