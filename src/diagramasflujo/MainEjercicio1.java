package diagramasflujo;

import java.util.Scanner;

public class MainEjercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese dos numeros:");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int A = teclado.nextInt();
		System.out.println("primer numero:" + A);
		int B = teclado.nextInt();
		System.out.println("segundo numero:" + B);
		
		if(B==0) {
			System.out.println("No existe division para 0");
		}else {
			int R=A/B;
			System.out.println("La divison es:"+R);
					
		}
		
			
		
	}

}
