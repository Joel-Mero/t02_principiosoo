package diagramasflujo;

import java.util.Scanner;

public class MainEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese valor del sueldo:");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int S = teclado.nextInt();
		
		if(S<300) {
			System.out.println("Su bonificación es:" +100);
			int B = teclado.nextInt();
			int T= S + B;
			System.out.println("Neto a recibir:"+T);
		}else {
			if(S>300 && S<400) {
				System.out.println("Su bonificación es:" +70);
				int B = teclado.nextInt();
				int T= S + B;
				System.out.println("Neto a recibir:"+T);
			}else {
				if(S>400) {
					System.out.println("Su bonificación es:" +50);
					int B = teclado.nextInt();
					int T= S + B;
					System.out.println("Neto a recibir:"+T);
				}
			}
		}
		
	}

}
