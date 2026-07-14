package sistema_alunos;

import java.util.Objects;

public class Aluno {

	private String nome;
	private String matricula;
	private double coeficienteRendimento;

	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.coeficienteRendimento = 0;
	}

	public Aluno(String nome, String matricula, double coeficienteRendimento) {
		this.nome = nome;
		this.matricula = matricula;
		this.coeficienteRendimento = coeficienteRendimento;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getCoeficienteRendimento() {
		return coeficienteRendimento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula);
	}

	
}