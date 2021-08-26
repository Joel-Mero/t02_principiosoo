package metodos;

public class Paciente {

	private String nombre; //SET y GET
	private String apellido; //SET y GET
	private int edad; //SET y GET
	
	private void caminar () {
		
	}
	
	private void correr () {
		
	}
	
	//Metodos SET y GET 
	//Siempre son públicos
	
	//Nombre
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre () {
		return this.nombre;
	}
	
	//Apellido
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido () {
		return this.apellido;
	}
	
	//Edad
	public void setEdad (int edad) {
		this.edad = edad;
		
	}
	
	public int getEdad () {
		return this.edad;
	}
	
}
