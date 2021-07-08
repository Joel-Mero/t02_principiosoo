package diagramasflujo;

import java.util.Scanner;

public class MainE1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese valor del sueldo:");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int S = teclado.nextInt();
		
		if(S<300) {
			System.out.println("Su bonificación es:" +40);
		}else {
			System.out.println("Su bonificación es:" +0);		
					}
	}

}
