//  Registrador para a Turma
public class Turma {
    String codigoDisciplina;
    Aluno[] alunos;

    // Método responsável pelo redimensionamento dinâmico do vetor
    void adicionarAluno(Aluno a) {
        // 1. Cria um novo vetor com tamanho = (tamanho atual + 1)
        Aluno[] novoVetor = new Aluno[alunos.length + 1];
        
        // 2. Copia os alunos do vetor antigo para o novo vetor
        for (int i = 0; i < alunos.length; i++) {
            novoVetor[i] = alunos[i];
        }
        
        // 3. Adiciona o novo aluno na última posição do novo vetor
        novoVetor[novoVetor.length - 1] = a;
        
        // 4. Substitui a referência do vetor antigo pelo novo
        alunos = novoVetor;
    }
}
