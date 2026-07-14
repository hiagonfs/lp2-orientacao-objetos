package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sistema_alunos.Aluno;
import sistema_alunos.ControladorSistemaAcademico;
import sistema_alunos.Disciplina;
import sistema_alunos.Professor;

public class ControladorSistemaAcademicoTest {

	@Test
	public void deveAdicionarAlunoNoSistema() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001");

		assertEquals(1, controlador.verificaQuantidadeAlunosNoSistema());
	}

	@Test
	public void deveAdicionarProfessorNoSistema() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");

		assertEquals(1, controlador.verificaQuantidadeProfessoresNoSistema());
	}

	@Test
	public void deveAdicionarDisciplinaNoSistema() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		assertEquals(1, controlador.verificaQuantidadeDisciplinasNoSistema());
	}

	@Test
	public void naoDeveAdicionarDisciplinaSemProfessorCadastrado() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		assertEquals(0, controlador.verificaQuantidadeDisciplinasNoSistema());
	}

	@Test
	public void naoDeveAdicionarDisciplinaDuplicada() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");

		controlador.adicionarDisciplina("Linguagem de Programação II", "100");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		assertEquals(1, controlador.verificaQuantidadeDisciplinasNoSistema());
	}

	@Test
	public void deveBuscarAlunoPelaMatricula() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 9.0);

		Aluno aluno = controlador.buscarAluno("2024001");

		assertEquals("Maria", aluno.getNome());
		assertEquals("2024001", aluno.getMatricula());
		assertEquals(9.0, aluno.getCoeficienteRendimento(), 0.0001);
	}

	@Test
	public void deveBuscarProfessorPeloCodigoCracha() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");

		Professor professor = controlador.buscarProfessor("100");

		assertEquals("João", professor.getNome());
		assertEquals("100", professor.getCodigoDeCracha());
		assertEquals("Programação", professor.getAreaAtuacao());
	}

	@Test
	public void deveBuscarDisciplinaPeloNome() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		Disciplina disciplina = controlador.buscarDisciplina("Linguagem de Programação II");

		assertEquals("Linguagem de Programação II", disciplina.getNome());
		assertEquals("João", disciplina.getProfessorResponsavel().getNome());
	}

	@Test
	public void deveMatricularAlunoEmDisciplina() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 9.0);
		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		controlador.matricularAlunoEmDisciplina("2024001", "Linguagem de Programação II");

		assertEquals(1, controlador.verificarLotacaoDisciplina("Linguagem de Programação II"));
	}

	@Test
	public void naoDeveMatricularAlunoInexistente() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		controlador.matricularAlunoEmDisciplina("999", "Linguagem de Programação II");

		assertEquals(0, controlador.verificarLotacaoDisciplina("Linguagem de Programação II"));
	}

	@Test
	public void naoDeveMatricularAlunoEmDisciplinaInexistente() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 9.0);

		controlador.matricularAlunoEmDisciplina("2024001", "Disciplina Inexistente");

		assertEquals(0, controlador.verificarLotacaoDisciplina("Disciplina Inexistente"));
	}

	@Test
	public void naoDeveMatricularMesmoAlunoDuasVezesNaMesmaDisciplina() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 9.0);
		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		controlador.matricularAlunoEmDisciplina("2024001", "Linguagem de Programação II");
		controlador.matricularAlunoEmDisciplina("2024001", "Linguagem de Programação II");

		assertEquals(1, controlador.verificarLotacaoDisciplina("Linguagem de Programação II"));
	}

	@Test
	public void deveCalcularMediaGeralDaDisciplina() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 9.0);
		controlador.adicionarAluno("Pedro", "2024002", 7.0);

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		controlador.matricularAlunoEmDisciplina("2024001", "Linguagem de Programação II");
		controlador.matricularAlunoEmDisciplina("2024002", "Linguagem de Programação II");

		assertEquals(8.0, controlador.calcularMediaGeralDisciplina("Linguagem de Programação II"), 0.0001);
	}

	@Test
	public void mediaDeDisciplinaSemAlunosDeveSerZero() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarDisciplina("Linguagem de Programação II", "100");

		assertEquals(0, controlador.calcularMediaGeralDisciplina("Linguagem de Programação II"), 0.0001);
	}

	@Test
	public void mediaDeDisciplinaInexistenteDeveSerZero() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		assertEquals(0, controlador.calcularMediaGeralDisciplina("Disciplina Inexistente"), 0.0001);
	}

	@Test
	public void deveGerarRelatorioComDisciplinaDeMaiorMedia() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		controlador.adicionarAluno("Maria", "2024001", 10.0);
		controlador.adicionarAluno("Pedro", "2024002", 6.0);
		controlador.adicionarAluno("Ana", "2024003", 8.0);

		controlador.adicionarProfessor("João", "100", "Programação");
		controlador.adicionarProfessor("Carlos", "200", "Banco de Dados");

		controlador.adicionarDisciplina("Linguagem de Programação II", "100");
		controlador.adicionarDisciplina("Banco de Dados", "200");

		controlador.matricularAlunoEmDisciplina("2024001", "Linguagem de Programação II");
		controlador.matricularAlunoEmDisciplina("2024003", "Linguagem de Programação II");

		controlador.matricularAlunoEmDisciplina("2024002", "Banco de Dados");

		String relatorio = controlador.gerarRelatorioExcelenciaGlobal();

		assertTrue(relatorio.contains("Linguagem de Programação II"));
		assertTrue(relatorio.contains("9.0"));
	}

	@Test
	public void relatorioSemDisciplinasDeveInformarQueNaoHaDisciplinas() {
		ControladorSistemaAcademico controlador = new ControladorSistemaAcademico();

		String relatorio = controlador.gerarRelatorioExcelenciaGlobal();

		assertEquals("Nenhuma disciplina cadastrada.", relatorio);
	}

}
