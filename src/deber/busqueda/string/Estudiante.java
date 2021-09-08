package deber.busqueda.string;

public class Estudiante {

	private String numeroCedula;
	public static String pais="ECUADOR";			//VARIABLES ESTATICAS
	public static String provinvia="PICHINCHA";		//VARIABLES ESTATICAS

	//Métodos SET y GET
	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	@Override
	public String toString() {
		return "Estudiante [numeroCedula=" + numeroCedula + "]";
	}

}
