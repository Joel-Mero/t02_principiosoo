package ejercicios.ordenamiento;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private int numeroLista;

	// SET y GET

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		// 3 posibles retornos
		// 0
		// -1
		// 1

		if (this.numeroLista > o.getNumeroLista()) {
			return 1;
		} else if (this.numeroLista == o.getNumeroLista()) {
			return 0;
		} else
			return -1;
	}

	public String toString() {
		return "Estudiante [nombre=" + nombre + ", numeroLista=" + numeroLista + "]"; // Prueba para GIT
	}

}
