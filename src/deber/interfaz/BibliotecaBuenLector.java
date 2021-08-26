package deber.interfaz;

public class BibliotecaBuenLector implements BibliotecaInterfaz {

	public void buscarLibro() {
		System.out.println("Buscar libro en las estanterías");
		
	}

	public void pedirDatos() {
		System.out.println("Solicitar nombre al cliente");
		System.out.println("Solicitar apellido al cliente");
	}

	public void pedirCredencial() {
		System.out.println("Solicitar credencial al cliente");
		System.out.println("Buscar numero de credencial en el sistema");
	}

	public void sellarCredencial() {
		System.out.println("Colocar sello de la Biblioteca en la credencial del cliente");
		
	}

	public void entregarLibro() {
		System.out.println("Entregar el libro al cliente");
		
	}

	public void pedirLibro() {
		System.out.println("Solicitar el libro en la fecha acordada");
		
	}

}
