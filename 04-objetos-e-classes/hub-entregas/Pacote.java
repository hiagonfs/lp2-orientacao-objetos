public class Pacote {

	String codigo;
	String destinatario;
	boolean entregue;

	Pacote(String codigo, String destinatario) {
		this.codigo = codigo;
		this.destinatario = destinatario;
		this.entregue = false;
	}

	void marcarComoEntregue() {
		this.entregue = true;
	}

	public String toString() {
		return "Pacote [codigo=" + codigo + ", destinatario=" + destinatario + "]";
	}

}
