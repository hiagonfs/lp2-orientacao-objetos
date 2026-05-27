// Registrador (apenas atributos e métodos)
public class Aluno {
    int matricula;
    String nome;
    double nota1;
    double nota2;

    // Método para calcular a média do aluno
    double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    // Método que verifica se o aluno está aprovado (Média >= 7.0)
    boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }
}
