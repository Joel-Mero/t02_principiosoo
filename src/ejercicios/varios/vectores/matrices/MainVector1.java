package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declare un vector X[3] de tipo char y construya un programa que pida al usuario que 
		// ingrese los valores para cada posición
		// y finalmente imprimir todos los valores ingresados
		
		char x[] = new char [3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingrese valor de la posición: " + i);
			Scanner teclado =new Scanner(System.in);
			char N = (char) teclado.next().charAt(0);	
			x[i] = N;	
		}
		// Recorriendo el vector lleno
		for (int i = 0; i < 3; i++) {
		System.out.println("El valor de la posición: " + i);
			System.out.println(x[i]);
		}
	
	}

}
