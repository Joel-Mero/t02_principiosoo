package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare una matriz [3,4] de tipo char y desarrolle un programa que vaya
		// solicitando
		// cada una sus posiciones
		
		// ESte es mi teclado
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese el n�emero de filas del vector:");
		// El usuario digita el n�mero de filas y yo debo leer desde teclado
		int longitudFila = teclado.nextInt();
		
		System.out.println("Ingrese el n�emero de columnas del vector:");
		// El usuario digita el n�mero de filas y yo debo leer desde teclado
		int longitudColumnas = teclado.nextInt();
		

		char A[][] = new char[longitudFila][longitudColumnas];

		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {

				System.out.println("Ingrese el valor fila: " + fila + " Columna: " + columna);
				// El usuario digita el valor ppor teclado y a continuaci�n lo leo
				char N = (char) teclado.next().charAt(0);

				A[fila][columna] = N;

			}
		}
		
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.println("El valor de la fila: " + fila + " y la Columna: " + columna + " es: " + A[fila][columna]);
			}
		}

	}

}
