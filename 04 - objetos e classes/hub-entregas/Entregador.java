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

    for (Pacote pacoteAtual: pacotes) {
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

  // FORMA BÁSICA DE FAZER O REMOVER
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

  // OUTRA FORMA DE FAZER O REMOVER USANDO MÉTODO AUXILIAR
  // método auxiliar (ajuda na organização)
  int buscarIndicePacote(String codigo) {
    for (int i = 0; i < qtdPacotes; i++) {
      if (pacotes[i].codigo.equalsIgnoreCase(codigo)) {
        return i;
      }
    }
    return - 1; // Retorna -1 se não encontrar
  }

  boolean removerPacotePorCodigoComAuxiliar(String codigo) {
    int indice = buscarIndicePacote(codigo);

    // se o índice for -1, o pacote não existe
    if (indice == -1) {
      return false;
    }

    // desloca os elementos a partir do índice encontrado
    for (int j = indice; j < qtdPacotes - 1; j++) {
      pacotes[j] = pacotes[j + 1];
    }

    // limpa o último elemento e atualiza a quantidade
    pacotes[qtdPacotes - 1] = null;
    qtdPacotes--;

    return true;
  }

  // OUTRA FORMA DE FAZER O REMOVER: PERCORRENDO O ARRAY INTEIRO
  boolean removerPacotePorCodigoArrayInteiro(String codigo) {

    // o laço vai até o fim do array (pacotes.length)
    for (int i = 0; i < pacotes.length; i++) {

      // verificação obrigatória de nulo ANTES de checar o código
      if (pacotes[i] != null && pacotes[i].codigo.equalsIgnoreCase(codigo)) {

        // puxa todos os elementos da frente para cobrir o buraco deixado pelo pacote removido.
        // atenção ao limite: pacotes.length - 1
        for (int j = i; j < pacotes.length - 1; j++) {
          pacotes[j] = pacotes[j + 1];
        }

        // limpa a última posição do array, já que tudo andou para a esquerda
        pacotes[pacotes.length - 1] = null;

        // atualiza o contador
        if (qtdPacotes > 0) {
          qtdPacotes--;
        }

        return true;
      }
    }

    return false; // retorna falso se percorreu tudo e não achou
  }

}
