package deber.busqueda.string;

public class Estudiante {

	private int numeroCedula;

	public int getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(int numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	@Override
	public String toString() {
		return "Estudiante [numeroCedula=" + numeroCedula + "]";
	}

}
