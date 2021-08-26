package deber.interfaz;

public class BibliotecaVirtual implements BibliotecaInterfaz{

	public void buscarLibro() {
		System.out.println("Buscar libro en la página web de la biblioteca");
		
	}

	public void pedirDatos() {
		System.out.println("Solicitar que ingrese datos del usuario");
		
	}

	public void pedirCredencial() {
		System.out.println("Solicitar una crendencial virtual");
		
	}

	public void sellarCredencial() {
		System.out.println("Registar todos los datos actuales de la credencial");
		
	}

	public void entregarLibro() {
		System.out.println("Entregar el libro al usuario");
	}

	public void pedirLibro() {
		System.out.println("Solicitar el libro después del tiempo acordado");
	}

}
