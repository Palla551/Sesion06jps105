package ual.hmis.sesion06.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculoTest {

	@Test
	void vehiculo() {
		Vehiculo v = new Vehiculo(5,4,1000);
		
		assertEquals(5, v.getNumPasajeros());
		assertEquals(1000, v.getTara());
		assertEquals(4, v.getNumRuedas());
		
	}

}
