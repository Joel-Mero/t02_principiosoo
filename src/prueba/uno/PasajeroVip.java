package prueba.uno;

public class PasajeroVip extends Pasajero{

	private String codigoMembresia;
	
	public PasajeroVip(String nombre, String apellido, String codigoMembresia, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMembresia = codigoMembresia;
		
	}

	//Métodos SET y GET
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	@Override
	public String toString() {
		return "PasajeroVip" + this.nombre + "[codigoMembresia=" + codigoMembresia + "]";
	}

	
}
