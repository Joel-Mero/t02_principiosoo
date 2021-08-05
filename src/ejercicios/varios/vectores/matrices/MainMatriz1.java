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
		
		
		System.out.println("Ingrese el número de filas del vector:");
		// El usuario digita el número de filas y yo debo leer desde teclado
		int longitudFila = teclado.nextInt();
		
		System.out.println("Ingrese el número de columnas del vector:");
		// El usuario digita el número de filas y yo debo leer desde teclado
		int longitudColumnas = teclado.nextInt();
		

		char A[][] = new char[longitudFila][longitudColumnas];

		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {

				System.out.println("Ingrese el valor fila: " + fila + " Columna: " + columna);
				// El usuario digita el valor ppor teclado y a continuación lo leo
				char N = (char) teclado.next().charAt(0);

				A[fila][columna] = N;

			}
		}
		
		System.out.println("Iniciamos a imprimir la matriz ");
		for (int fila = 0; fila < longitudFila; fila++) {
			for (int columna = 0; columna < longitudColumnas; columna++) {
				System.out.print(A[fila][columna] + " ");
			}
			System.out.println();
		}

	}

}
