package ual.hmis.sesion06.ejercicio4;

public class Ejercicio4 {

	public String innerJoin(String p1, String p2) {
		if (p1 == "" || p2 == "") return null;
		String res = "";
		
		for(char x : p1.toCharArray())
			res += (p2.indexOf(x) > 0)? x : "";
		
		return res;
	}
	
}
