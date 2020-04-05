package ual.hmis.sesion06.ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio3Test {

	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"-1, numero erroneo", "0, numero erroneo",
		"1, *****", "13, ************", "7, *******"})
	void numeroDeAsteriscos(int input, String expected) {
		Ejercicio3 c = new Ejercicio3();

		assertEquals(expected, c.asteriscos(input));
	}

}
