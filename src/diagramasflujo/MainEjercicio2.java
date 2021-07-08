package diagramasflujo;

import java.util.Scanner;

public class MainEjercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese dos numeros:");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int A = teclado.nextInt();
		System.out.println("primero numero:"+A);
		int B = teclado.nextInt();
		System.out.println("segundo numero"+B);
		

		if(A % B == 0) {
			System.out.println("El numero:"+ B + ",Es multiplo de:" + A);
		}else {
			System.out.println("El numero:"+ B + ",No es multiplo de:" + A);
		}
	}

}
