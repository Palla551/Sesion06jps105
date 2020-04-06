package ual.hmis.sesion06.ejercicio8;

import java.util.ArrayList;

public class Ferry {
	
	private int maxNumPasajeros;
	private int maxNumVehiculos;
	private int maxPesoVehiculos;
	private int totalPasajeros;
	private int pesoTotalVehiculos;
	
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	
	public Ferry(int maxNumPasajeros, int maxNumVehiculos, int maxPesoVehiculos) {
		super();
		this.maxNumPasajeros = maxNumPasajeros;
		this.maxNumVehiculos = maxNumVehiculos;
		this.maxPesoVehiculos = maxPesoVehiculos;
		this.totalPasajeros = 0;
		this.pesoTotalVehiculos = 0;
	}

	public boolean embarcarVehiculo(Vehiculo v){
		if(superadoMaximoPeso() || superadoMaximoVehiculos()) return false;
		if(pesoTotalVehiculos + v.getTara() > maxPesoVehiculos) return false;
			
		pesoTotalVehiculos += v.getTara();
		return vehiculos.add(v);
	}
	
	public int totalVhiculo() {
		return vehiculos.size();
	}
	
	public boolean vacio() {
		return vehiculos.isEmpty();
	}
	
	public boolean superadoMaximoVehiculos(){
		return maxNumVehiculos <= vehiculos.size();
	}
	
	public boolean superadoMaximoPeso() {
		return pesoTotalVehiculos >= maxPesoVehiculos;
	}

	public void setPesoTotalVehiculos(int pesoTotalVehiculos) {
		this.pesoTotalVehiculos = pesoTotalVehiculos;
	}
	
	
	
}
