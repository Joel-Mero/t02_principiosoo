package correccion.prueba;

import java.util.Scanner;

public class EjerDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un número:");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		int SP = 0;
		int SI = N;
		int CI = 0;
		float PI = 0F;
		
		do {
			System.out.println("Ingrese un número:");
			N = teclado.nextInt();
			
			if (N % 2 == 0) {
				SP= (SP + N);
			} else {
				SI = SI + N;
				CI = CI + 1;
				PI = (SI / CI) + 1;
			}
		} while (N != -1);
		
		System.out.println("La suma es:" + SP);
		System.out.println();// SALTO DE LÍNEA
		System.out.println("El promedio es:" + PI);
	}

}
