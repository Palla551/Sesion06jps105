package ual.hmis.sesion06.ejercicio3;

public class Ejercicio3 {

	public String asteriscos(int asteriscos) {
		if(asteriscos <= 0) return "numero erroneo";
		
		int a = (asteriscos > 12)? 12 : (asteriscos < 5)? 5 : asteriscos;
		String res = "";
		
		for(int x = 0; x < a; x++) res += '*';
		
		return res;
	}
	
}
