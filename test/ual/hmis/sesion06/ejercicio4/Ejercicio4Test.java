package ual.hmis.sesion06.ejercicio4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejercicio4Test {

	@ParameterizedTest // (name = "{index} => Con entrada ({0}) sale {1}")
	@CsvSource({"asdf, zzzzaszzzz, as"})
	void innerJoinTest(String p1, String p2, String expected) {
		Ejercicio4 c = new Ejercicio4();

		assertEquals(expected, c.innerJoin(p1,p2));
		assertNotEquals(p2, c.innerJoin(p1, expected));
		assertNull(c.innerJoin("", ""));
	}

}
