package diagramas.de.flujo;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Excelente trabajo bro <3 
		
		System.out.println("Ingrese el número de filas:");
		Scanner teclado = new Scanner(System.in);// TECLADO
		int N = teclado.nextInt();

		for (int fila = 1; fila <= N; fila++) {

			for (int ast = N; ast >= fila; ast--) {
				System.out.print("*");
			}
			System.out.println();// SALTO DE LÍNEA
		}
	}

}
