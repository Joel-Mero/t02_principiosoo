package correccion.prueba;

import java.util.Scanner;

public class EjerWhilw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un número:");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();

		int S = N;
		float P = 0F;
		int C = 0;

		while (N != 0) {
			System.out.println("Ingrese un número:");
			N = teclado.nextInt();

			S = S + N;
			C = C + 1;
			P = S / C;

		}

		System.out.println("La suma es:" + S);
		System.out.println(); // Salto de línea
		System.out.println("El promedio es:" + P);
		System.out.println(); // Salto de línea
		System.out.println("Cantidad es:" + C);

	}

}
