package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare una matriz [3,4] de tipo char y desarrolle un programa que vaya
		// solicitando
		// cada una sus posiciones

		char A[][] = new char[3][4];

		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {

				System.out.println("Ingrese el valor fila: " + fila + " Columna: " + columna);
				// El usuario digita el valor ppor teclado y a continuación lo leo
				Scanner teclado = new Scanner(System.in);
				char N = (char) teclado.next().charAt(0);

				A[fila][columna] = N;

			}
		}
		
		for (int fila = 0; fila < 3; fila++) {
			for (int columna = 0; columna < 4; columna++) {
				System.out.println("El valor de la fila: " + fila + " y la Columna: " + columna + " es: " + A[fila][columna]);
			}
		}

	}

}
