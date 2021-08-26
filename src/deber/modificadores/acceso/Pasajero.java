package deber.modificadores.acceso;

public class Pasajero extends ViajeAvion {

	public void comprarVoleto () {
		System.out.println("Su nombre es: " + nombrePasajero);
		System.out.println("Su número de línea es: " + numeroLinea);
		
		formaPago ();
		clase ();	
		
	}
	
}
