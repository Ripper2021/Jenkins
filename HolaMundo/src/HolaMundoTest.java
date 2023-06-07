import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class HolaMundoTest {

	@Test
	public void testObtenerSaludo()
	{
		HolaMundo hola = new HolaMundo();
		String saludo = hola.obtenerSaludo();
		assertEquals("Hola mundo!", saludo);
	}
}
