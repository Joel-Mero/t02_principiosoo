package reserva.de.viajes;

public class Adulto extends Pasajero{

	private String nombre;
	private String apellido;
	private int codigoSeguroSocial;
	private String empresaTrabjo;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCodigoSeguroSocial() {
		return codigoSeguroSocial;
	}
	public void setCodigoSeguroSocial(int codigoSeguroSocial) {
		this.codigoSeguroSocial = codigoSeguroSocial;
	}
	public String getEmpresaTrabjo() {
		return empresaTrabjo;
	}
	public void setEmpresaTrabjo(String empresaTrabjo) {
		this.empresaTrabjo = empresaTrabjo;
	}
	
}
