package deber.busqueda.string;

import java.util.Scanner;

public class Main extends Estudiante{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 0; 
		do {
			System.out.println("-----MENÚ-----");	
			System.out.println("1. Ingresar Estudiante");
			System.out.println("2. Buscar Estudiante");
			System.out.println("3. SALIR");
			
			Scanner teclado = new Scanner(System.in);// TECLADO
			N = teclado.nextInt();
			
			if (N == 1) {
				System.out.println("Ingresar Cédula de Estudiante");
				int C = teclado.nextInt();
				
				Estudiante estudiante1 = new Estudiante ();
				estudiante1.setNumeroCedula(C);
				
				Estudiante estudiante2 = new Estudiante ();
				estudiante2.setNumeroCedula(C);
				
				Estudiante estudiante3 = new Estudiante ();
				estudiante3.setNumeroCedula(C);
				
				Estudiante estudiante4 = new Estudiante ();
				estudiante4.setNumeroCedula(C);
				
				Estudiante estudiante5 = new Estudiante ();
				estudiante5.setNumeroCedula(C);
				
				Estudiante estudiante[] = new Estudiante [5];
				estudiante[0] = estudiante1;
				estudiante[1] = estudiante2;
				estudiante[2] = estudiante3;
				estudiante[3] = estudiante4;
				estudiante[4] = estudiante5;
								
			}else if (N == 2) {
				
				System.out.println("Ingrese Cédula para Comparar");
				String C = teclado.nextLine();				
				
				boolean resultado = C.contains(C);
				System.out.println("Contine al estudiante: " + resultado);	
			}
			
		}while (N != 3);	
	}

}
