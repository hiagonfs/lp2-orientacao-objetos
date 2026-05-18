import java.util.Scanner;

public class CalculadoraNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema Acadêmico ===");

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2.0;

        String situacao = "";
        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 4.0) {
            situacao = "Em Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("\n--- Boletim Final ---");
        System.out.println("Aluno(a): " + nome);
        System.out.printf("Média: %.2f\n", media);
        System.out.println("Situação: " + situacao);
        System.out.println("---------------------");

        scanner.close();
    }
}
