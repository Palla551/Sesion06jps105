package ual.hmis.sesion06.ejercicio8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class FerryTest {

	private ArrayList<Vehiculo> vehiculos;
	private Ferry ferry;

	@Test
	void embarcarVehiculo() {
		ferry = new Ferry(100, 2, 25000);
		
		assertFalse(ferry.embarcarVehiculo(new Vehiculo(2, 18, 30000)));
		assertTrue(ferry.embarcarVehiculo(new Vehiculo(4, 4, 1000)));
		assertTrue(ferry.embarcarVehiculo(new Vehiculo(5, 4, 3000)));
		assertFalse(ferry.embarcarVehiculo(new Vehiculo(2, 2, 130)));
	}
	
	@Test
	void totalVehiculos() {
		ferry = new Ferry(100, 2, 25000);
		
		assertEquals(0, ferry.totalVhiculo());
		
		ferry.embarcarVehiculo(new Vehiculo(5, 4, 3000));
		ferry.embarcarVehiculo(new Vehiculo(2, 2, 130));
		
		assertEquals(2, ferry.totalVhiculo());
	}
	
	@Test
	void vacio() {
		ferry = new Ferry(100, 2, 25000);
		
		assertTrue(ferry.vacio());
		
		ferry.embarcarVehiculo(new Vehiculo(5, 4, 3000));
		
		assertFalse(ferry.vacio());
	}
	
	@Test
	void superadoPesoMaximo() {
		ferry = new Ferry(100, 2,25000);
				
		assertFalse(ferry.superadoMaximoPeso());

		ferry.setPesoTotalVehiculos(30000);
		
		assertTrue(ferry.superadoMaximoPeso());
	}
	
}
