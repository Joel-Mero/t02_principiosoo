package correccion.prueba;

import java.util.Scanner;

public class Ejer1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int S=0;
		int P=0;
		int C=0;
		
		for (int i=1; i != 0; i++) {
			System.out.println("Ingrese un número:");
			Scanner teclado = new Scanner(System.in);
			int N = teclado.nextInt();
			
			if (N==0) {
				i = -1;
			}else {
				S = S + N;
				C = C + 1;
				P = S / C;
			}
		}
		System.out.println("La suma es:" + S);
		System.out.println();// SALTO DE LÍNEA
		System.out.println("El promedio es:" + P);
		System.out.println();// SALTO DE LÍNEA
		System.out.println("Cantidad es:" + C);
	}
	
}








