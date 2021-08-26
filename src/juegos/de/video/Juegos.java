package juegos.de.video;

public class Juegos {
	
	int ventas = 0;
	int juegos= 0;
	String nombre = "";
	String tipo = "";
	
	
	
	public interface juego {
	     String nombre = "";
	     int costo = 7;
	     
	}
	
	public interface tipo {
		String tipo = "";
		String entorno = "";
	}
	
	public void vender () {
		System.out.println("Juegos vendidos: ");
		System.out.println("Ganancias del juego: ");
	}
	
	private void salir () {
		System.out.println("Fecha de salido del juego: ");
	}
	
	static final int VENTAS_MAXIMAS = 435;
	static final String JUEGOS_VENDIDOS = ""; 
}
