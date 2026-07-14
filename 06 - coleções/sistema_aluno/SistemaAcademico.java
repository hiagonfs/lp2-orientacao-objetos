package sistema_alunos;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaAcademico {

	private HashMap<String, Aluno> alunos;
	private HashMap<String, Professor> professores;
	private HashSet<Disciplina> disciplinas;

	public SistemaAcademico() {
		this.alunos = new HashMap<String, Aluno>();
		this.professores = new HashMap<String, Professor>();
		this.disciplinas = new HashSet<Disciplina>();
	}

	public void adicionarAluno(String nome, String matricula) {
		Aluno novoAluno = new Aluno(nome, matricula);
		alunos.put(matricula, novoAluno);
	}

	public void adicionarAluno(String nome, String matricula, double coeficienteRendimento) {
		Aluno novoAluno = new Aluno(nome, matricula, coeficienteRendimento);
		alunos.put(matricula, novoAluno);
	}

	public void adicionarProfessor(String nome, String codigoCracha, String areaAtuacao) {
		Professor novoProf = new Professor(nome, codigoCracha, areaAtuacao);
		professores.put(codigoCracha, novoProf);
	}

	public void adicionarDisciplina(String nomeDisciplina, String codigoCrachaProfessor) {
		Professor professor = buscarProfessor(codigoCrachaProfessor);

		if (professor != null) {
			Disciplina novaDisciplina = new Disciplina(nomeDisciplina, professor);
			disciplinas.add(novaDisciplina);
		}
	}

	public void matricularAlunoEmDisciplina(String matriculaAluno, String nomeDisciplina) {
		Aluno aluno = buscarAluno(matriculaAluno);
		Disciplina disciplina = buscarDisciplina(nomeDisciplina);

		if (aluno != null && disciplina != null) {
			disciplina.matricularAluno(aluno);
		}
	}

	public Aluno buscarAluno(String matricula) {
		return alunos.get(matricula);
	}

	public Professor buscarProfessor(String codigoCracha) {
		return professores.get(codigoCracha);
	}

	public Disciplina buscarDisciplina(String nomeDisciplina) {
		for (Disciplina disciplina : disciplinas) {
			if (disciplina.getNome().equalsIgnoreCase(nomeDisciplina)) {
				return disciplina;
			}
		}

		return null;
	}

	public int verificarLotacaoDisciplina(String nomeDisciplina) {
		Disciplina disciplina = buscarDisciplina(nomeDisciplina);

		if (disciplina != null) {
			return disciplina.getLotacaoAtual();
		}

		return 0;
	}

	public double calcularMediaGeralDisciplina(String nomeDisciplina) {
		Disciplina disciplina = buscarDisciplina(nomeDisciplina);

		if (disciplina != null) {
			return disciplina.calcularMediaGeral();
		}

		return 0;
	}

	public Disciplina buscarDisciplinaComMaiorMedia() {
		Disciplina disciplinaComMaiorMedia = null;
		double maiorMedia = -1;

		for (Disciplina disciplina : disciplinas) {
			double mediaAtual = disciplina.calcularMediaGeral();

			if (mediaAtual > maiorMedia) {
				maiorMedia = mediaAtual;
				disciplinaComMaiorMedia = disciplina;
			}
		}

		return disciplinaComMaiorMedia;
	}

	public String gerarRelatorioExcelenciaGlobal() {
		Disciplina melhorDisciplina = buscarDisciplinaComMaiorMedia();

		if (melhorDisciplina != null) {
			return "Disciplina com maior média: " + melhorDisciplina.getNome()
					+ " - Média: " + melhorDisciplina.calcularMediaGeral();
		}

		return "Nenhuma disciplina cadastrada.";
	}

	public int getQtdAlunosNoSistema() {
		return alunos.size();
	}

	public int getQtdProfessoresNoSistema() {
		return professores.size();
	}

	public int getQtdDisciplinasNoSistema() {
		return disciplinas.size();
	}
}