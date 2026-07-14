package sistema_alunos;

import java.util.ArrayList;
import java.util.Objects;

public class Disciplina {

	private String nome;
	private Professor professorResponsavel;
	private ArrayList<Aluno> alunosMatriculados;

	public Disciplina(String nome, Professor professorResponsavel) {
		this.nome = nome;
		this.professorResponsavel = professorResponsavel;
		this.alunosMatriculados = new ArrayList<Aluno>();
	}

	public String getNome() {
		return nome;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void matricularAluno(Aluno aluno) {
		if (!alunosMatriculados.contains(aluno)) {
			alunosMatriculados.add(aluno);
		}
	}

	public int getLotacaoAtual() {
		return alunosMatriculados.size();
	}

	public double calcularMediaGeral() {
		if (alunosMatriculados.isEmpty()) {
			return 0;
		}

		double soma = 0;

		for (Aluno aluno : alunosMatriculados) {
			soma += aluno.getCoeficienteRendimento();
		}

		return soma / alunosMatriculados.size();
	}

	public ArrayList<Aluno> getAlunosMatriculados() {
		return alunosMatriculados;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Disciplina)) {
			return false;
		}

		Disciplina outraDisciplina = (Disciplina) obj;

		return this.nome.equalsIgnoreCase(outraDisciplina.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome.toLowerCase());
	}
}