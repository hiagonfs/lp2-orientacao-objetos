package sistema_alunos;

import java.util.Objects;

public class Professor {

	private String nome;
	private String codigoDeCracha;
	private String areaAtuacao;

	public Professor(String nome, String codigoDeCracha, String areaAtuacao) {
		this.nome = nome;
		this.codigoDeCracha = codigoDeCracha;
		this.areaAtuacao = areaAtuacao;
	}

	public String getNome() {
		return nome;
	}

	public String getCodigoDeCracha() {
		return codigoDeCracha;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoDeCracha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return Objects.equals(codigoDeCracha, other.codigoDeCracha);
	}

}