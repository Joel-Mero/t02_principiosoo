package ejercicios.modificadores.acceso.enfermeras;

import ejercicios.modificadores.acceso.TerceraEdad;

public class Enfermera {

	public void darDeAlta () {
		TerceraEdad pepito = new TerceraEdad ();
		pepito.examenProstata();
		pepito.nombre="";
		pepito.apellido="";
		pepito.realizarDiagnostico (); 
		
	}
}
