package ual.hmis.sesion06.ejercicio2;

public class Ejercicio2 {
	
	private String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{1,}";
	
	public boolean login (String username, String password) {
		if(username.length() == 0 || password.length() == 0 ) return false;
		if(username.length() >= 30 || password.length() >= 30 ) return false;
		if(!password.matches(pattern)) return false;

		return compruebaLoginEnBD(username, password);
	}
	
	public boolean compruebaLoginEnBD(String username, String password) {
		return (username.equals("uSer1") && password.equals("pAss1"));
	}
}
