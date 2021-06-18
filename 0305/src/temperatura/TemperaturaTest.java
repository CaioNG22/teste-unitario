package temperatura;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class TemperaturaTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCelsiusParaFarenheit() {
		assertEquals("caso 1:",50,Temperatura.celsiusParaFarenheit(10),1);
		assertEquals("caso 2:",35.6,Temperatura.celsiusParaFarenheit(2),0);
		assertTrue("caso 3:",50 ==Temperatura.celsiusParaFarenheit(10));
		assertFalse("caso 3:",49 ==Temperatura.celsiusParaFarenheit(10));
		assertFalse("caso 4:",50==Temperatura.celsiusParaFarenheit(30));
	}

	@Test
	public void testCelsiusParaKelvin() {
		assertEquals("caso 1:",283.15,Temperatura.celsiusParaKelvin(10),0);
		assertEquals("caso 2:",274.15,Temperatura.celsiusParaKelvin(1),0);
		assertTrue("caso 3:",296.15==Temperatura.celsiusParaKelvin(23));
		assertFalse("caso 4:",50==Temperatura.celsiusParaKelvin(30));
	}

	@Test
	public void testClassificaTemperatura() {
		assertEquals("Caso 05: ", "POSITIVA", Temperatura.classificaTemperatura(4));
		assertEquals("Caso 06: ", "ZERO", Temperatura.classificaTemperatura(0));
		assertEquals("Caso 07: ", "NEGATIVA", Temperatura.classificaTemperatura(-10));
	}

	@Test
	public void testValidaConversaoCelsiusFarenheit() {
		assertEquals("Caso 8: ", false, Temperatura.validaConversaoCelsiusFarenheit(10,20));
		
		assertTrue("Caso 9: ", false == Temperatura.validaConversaoCelsiusFarenheit(10,20));
		assertTrue("Caso 10: ", true == Temperatura.validaConversaoCelsiusFarenheit(20,68));
	}

}
