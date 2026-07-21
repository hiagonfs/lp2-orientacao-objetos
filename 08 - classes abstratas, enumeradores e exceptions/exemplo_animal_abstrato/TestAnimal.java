import static org.junit.Assert.assertTrue;

import org.junit.Test;

import controlador.ControladorCadastroAnimal;

public class TestAnimal {

	private ControladorCadastroAnimal controlador = new ControladorCadastroAnimal();

	@Test
	public void testCriaAnimal() {

		boolean cadastrou = controlador.cadastraCachorro("Rex", 2, "Golden");

		assertTrue(cadastrou);

	}

}
