//1. Declaración del paquete
package ejercicios.metodos;

//2. Declaración de importaciones


//3. Comentarios
//Clase que se encarga de realizar una impresión en formatos A4

//4. Declaración de la clase
public class Impresora {

	//5. Constantes
	//6. Variables
	public String color;
	
	//7. Constructor
	public Impresora() {
		
	}
	
	//8. Métodos
	public void imprimir(String datosAImprimir, int letra) {
		System.out.println("Logo UCE");
		System.out.println("*********");
		System.out.println(datosAImprimir);
		System.out.println("******");
		System.out.println("Pie de firma");
		
	}
}
