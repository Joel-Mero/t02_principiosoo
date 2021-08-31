package deber.menu.cajero;

import java.util.Scanner;

public class MenuCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("-----Banco Pichincha-----");	
		System.out.println("---Selecciones una opción---");
		System.out.println("1. Retirar Dinero");
		System.out.println("2. Cambiar Clave");
		System.out.println("3. Bloquear Cuanta");
		System.out.println("4. Salir");
		System.out.println("-----Eliga una opción-----");

		Scanner teclado = new Scanner(System.in);// TECLADO
		int U = teclado.nextInt();

		while (U < 4) {
			if (U == 1) {
				System.out.println("Ingresar valor a retirar");
				int V = teclado.nextInt();
				System.out.println("El valor a retirar es: " + V);
				System.out.println();
			} else {
				if (U == 2) {
					System.out.println("Ingrese nueva clave");
					int C = teclado.nextInt();
					System.out.println("Su clave ha sido cambiada: " + C);
					System.out.println();
				} else {
					if (U == 3) {
						System.out.println("Su cuenta ha sido bloqueada");
						System.out.println();
					} 
				}
			}
			System.out.println("-----Banco Pichincha-----");
			System.out.println("1. Retirar Dinero");
			System.out.println("2. Cambiar Clave");
			System.out.println("3. Bloquear Cuanta");
			System.out.println("4. Salir");
			System.out.println("-----Eliga una opción-----");
			U = teclado.nextInt();
		}
	}

}
