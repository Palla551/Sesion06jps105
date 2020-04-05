package ual.hmis.sesion06.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio2Test {

	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"uSer1, pAss1"})
	void loginTest(String user, String password) {
		Ejercicio2 c = new Ejercicio2();
		
		assertTrue(c.login(user, password));
		assertFalse(c.login("",""));
		assertFalse(c.login("Aa1234567890123456789012345678901",
				"Aa1234567890123456789012345678901"));
		assertFalse(c.login("user","password"));
	}
	
	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"asdf, adsf"})
	void compruebaLoginEnBDTest(String user, String password) {
		Ejercicio2 c = new Ejercicio2();
		
		assertTrue(c.compruebaLoginEnBD("uSer1", "pAss1"));
		assertFalse(c.compruebaLoginEnBD(user, password));
	}

}
