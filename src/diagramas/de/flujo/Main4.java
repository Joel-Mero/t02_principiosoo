package diagramas.de.flujo;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el número de filas:");
		Scanner teclado = new Scanner(System.in);// TECLADO
		int N = teclado.nextInt();

		for (int fila = 1; fila <= N; fila++) {

			for (int ast = 1; ast <= fila; ast++) {
				System.out.print("*");
			}

			System.out.println();// SALTO DE LÍNEA
		}
	}

}
