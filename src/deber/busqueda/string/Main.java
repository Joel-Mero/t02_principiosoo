package deber.busqueda.string;

import java.util.Scanner;

public class Main extends Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 0;
		
		Estudiante fila[] = new Estudiante[5];

		Estudiante estudiante1 = new Estudiante();
		estudiante1.setNumeroCedula("1723456789");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setNumeroCedula("1732323223");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setNumeroCedula("1792832783");

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setNumeroCedula("1792328743");

		Estudiante estudiante5 = new Estudiante();
		estudiante5.setNumeroCedula("1730947373");

		fila[0] = estudiante1;
		fila[1] = estudiante2;
		fila[2] = estudiante3;
		fila[3] = estudiante4;
		fila[4] = estudiante5;
		
		do {
			System.out.println("-----MENÚ-----");
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. SALIR");
			Scanner teclado = new Scanner(System.in);// TECLADO
			N = teclado.nextInt();

			if (N == 1) {
				System.out.println("Ingresar Cédula de Estudiante");
				System.out.println();
				String cedula = teclado.nextLine();

			} else if (N == 2) {
				System.out.println("Buscar Cédula del Estudiante");
				String cedula = teclado.nextLine();
				String cedulaBuscar = "22372";

				for (int i = 0; i < 5; i++) {
					Estudiante estudiante = fila[i];
					String cedulaDelEstudianteActual = estudiante.getNumeroCedula();
					boolean resultado = cedulaBuscar.equals(cedulaDelEstudianteActual);
					
					if (resultado == true) {
						System.out.println("Estudiante encontrado");
					}

				}

			}

		} while (N != 3);
	}

}
