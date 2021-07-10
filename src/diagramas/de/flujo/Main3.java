package diagramas.de.flujo;

import java.util.Scanner;

public class Main3 {
	//Imprimir la tabla del 7 multiplicado hasta el 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Tabla del 7:");
		Scanner teclado =new Scanner(System.in);//TECLADO	
		int N = teclado.nextInt();
		
		for(int T=0; T<=12; T++) {
			int R = N * T;
			System.out.println(R);
		}
	}

}
