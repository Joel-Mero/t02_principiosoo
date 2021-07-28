package correccion.prueba;

import java.util.Scanner;

public class Ejer2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int SP=0;
	int SI=0;
	int CI=0;
	int PI=0;
	
	for (int i=1; i != -1; i++) {
		System.out.println("Ingrese un número:");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		if (N == -1) {
			i = -2;		
		}else {
			if (N % 2 == 0) {
				SP = SP + N;
			}else {
				SI = SI + N;
				CI = CI + 1;
				PI = SI / CI;
			}
		}
	}
	System.out.println("La suma es:" + SP);
	System.out.println();// SALTO DE LÍNEA
	System.out.println("El promedio es:" + PI);
		
	
	}

}






