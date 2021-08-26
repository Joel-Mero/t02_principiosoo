package deber.modificadores.acceso.piloto;

import deber.modificadores.acceso.Pasajero;

public class Piloto {
	
	public void volar () {
		Pasajero diego = new Pasajero (); 
		diego.nombrePasajero="";
		diego.nombreLinea="";
		diego.formaPago ();
	}		
}
