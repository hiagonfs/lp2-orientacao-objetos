package sistema_alunos;

public class ControladorSistemaAcademico {

	private SistemaAcademico sistema;

	public ControladorSistemaAcademico() {
		this.sistema = new SistemaAcademico();
	}

	public void adicionarAluno(String nome, String matricula) {
		sistema.adicionarAluno(nome, matricula);
	}

	public void adicionarAluno(String nome, String matricula, double coeficienteRendimento) {
		sistema.adicionarAluno(nome, matricula, coeficienteRendimento);
	}

	public void adicionarProfessor(String nome, String codigoCracha, String areaAtuacao) {
		sistema.adicionarProfessor(nome, codigoCracha, areaAtuacao);
	}

	public void adicionarDisciplina(String nomeDisciplina, String codigoCrachaProfessor) {
		sistema.adicionarDisciplina(nomeDisciplina, codigoCrachaProfessor);
	}

	public void matricularAlunoEmDisciplina(String matriculaAluno, String nomeDisciplina) {
		sistema.matricularAlunoEmDisciplina(matriculaAluno, nomeDisciplina);
	}

	public int verificaQuantidadeAlunosNoSistema() {
		return sistema.getQtdAlunosNoSistema();
	}

	public int verificaQuantidadeProfessoresNoSistema() {
		return sistema.getQtdProfessoresNoSistema();
	}

	public int verificaQuantidadeDisciplinasNoSistema() {
		return sistema.getQtdDisciplinasNoSistema();
	}

	public int verificarLotacaoDisciplina(String nomeDisciplina) {
		return sistema.verificarLotacaoDisciplina(nomeDisciplina);
	}

	public double calcularMediaGeralDisciplina(String nomeDisciplina) {
		return sistema.calcularMediaGeralDisciplina(nomeDisciplina);
	}

	public String gerarRelatorioExcelenciaGlobal() {
		return sistema.gerarRelatorioExcelenciaGlobal();
	}

	public Aluno buscarAluno(String matricula) {
		return sistema.buscarAluno(matricula);
	}

	public Professor buscarProfessor(String codigoCracha) {
		return sistema.buscarProfessor(codigoCracha);
	}

	public Disciplina buscarDisciplina(String nomeDisciplina) {
		return sistema.buscarDisciplina(nomeDisciplina);
	}
}