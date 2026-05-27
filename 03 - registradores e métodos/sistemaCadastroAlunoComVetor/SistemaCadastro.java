import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        // Inicia o Scanner
        Scanner scanner = new Scanner(System.in);

        // Cria uma referência para a turma
        Turma turma = new Turma();

        // Inicialmente, o vetor de alunos da turma deve ter tamanho zero
        turma.alunos = new Aluno[0];

        System.out.println("-- ENTRADA --");
        System.out.print("Digite o código da disciplina: ");
        turma.codigoDisciplina = scanner.nextLine();

        String opcao = "S";

        // Laço de leitura de alunos
        while (!opcao.equalsIgnoreCase("N")) {
            System.out.print("Deseja matricular um aluno? (S/N): ");
            opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("S")) {
                // Cria uma referência para aluno
                Aluno novoAluno = new Aluno();

                // Preenchimento dos atributos do aluno manualmente
                System.out.print("Matrícula: ");
                novoAluno.matricula = scanner.nextInt();

                // Limpeza de buffer
                scanner.nextLine();

                System.out.print("Nome: ");
                novoAluno.nome = scanner.nextLine();

                System.out.print("Nota 1: ");
                novoAluno.nota1 = scanner.nextDouble();

                System.out.print("Nota 2: ");
                novoAluno.nota2 = scanner.nextDouble();

                // Limpeza de buffer após ler número decimal
                scanner.nextLine();

                // Adiciona o aluno criado à turma
                turma.adicionarAluno(novoAluno);

                System.out.println();

            } else if (opcao.equalsIgnoreCase("N")) {
                System.out.println("Encerrando cadastro de alunos...");

            } else {
                System.out.println("Opção inválida. Digite S ou N.\n");
            }
        }

        // Exibição dos resultados
        System.out.println("\n-- SAÍDA --");
        System.out.println("Disciplina: " + turma.codigoDisciplina);
        System.out.println("Total de alunos matriculados: " + turma.alunos.length);
        System.out.println("\nAlunos Aprovados:");

        for (int i = 0; i < turma.alunos.length; i++) {
            Aluno alunoAtual = turma.alunos[i];

            if (alunoAtual.estaAprovado()) {
                System.out.println("Nome: " + alunoAtual.nome +
                                   " | Matrícula: " + alunoAtual.matricula +
                                   " | Média: " + alunoAtual.calcularMedia());
            }
        }

        scanner.close();
    }
}
