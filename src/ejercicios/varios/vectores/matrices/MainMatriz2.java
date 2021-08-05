package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Desarrollar un programa que imprima la siguiente imagen (EXCEL)
		
		int J[][] = new int [6][6];
		
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++){
				if (fila == columna) {
					J[fila][columna] = 1;
				}
			}
		}
		
		System.out.println("Iniciamos a imprimir la matriz ");
		for (int fila = 0; fila < 5; fila++) {
			for (int columna = 0; columna < 5; columna++){
				System.out.print(J[fila][columna] + " ");	
				
			}
			System.out.println();
		}
		
		
	}

}
