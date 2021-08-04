package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare un vector X cuya longitud se solicite al usuario de tipo int 
		//y construya un programa que pida al usuario que ingrese los valores para cada posición
		// y finalmente imprimir todos los valores ingresados
		
		System.out.println("Ingrese longitud del vector:");
		Scanner teclado =new Scanner(System.in);//TECLADO	
		int n = teclado.nextInt();
		
		int x[] = new int [n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Ingrese valor de la posición: " + i);
			int A = teclado.nextInt();	
			
			x[i] = A;
			
		}
		for (int i = 0; i < n; i++) {
			System.out.println("El valor de la posición: " + i);
				System.out.println(x[i]);
		}
	}

}
