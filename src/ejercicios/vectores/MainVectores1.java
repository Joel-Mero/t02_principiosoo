package ejercicios.vectores;

public class MainVectores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Declarar un vector de 8
		int x[]= new int [8];
				
		//2. Declarar un vector de Y(3) y asignar a la posicion 2 el valor de A
		char Y[] = new char [3];
		Y[0] = 'A';
		
		//3. Declarar un vector A(5)  asignar a la posición 0 el valor de 25, 
		// posición 3 el valor de 49 y a la posición 2 el valor de la posición 0
		int A[] = new int [5];
		A[0] = 25;
		A[3] = 49;
		A[2] = A[0];
		
		//4. Declarar un vector B(10), a la posición B[0] asignele el valor del vector 
		// A[3] del ejercicio anterior
		int B[] = new int [10];
		B[0] = A[3];
		
		//5. Declarar un vector Z(12) y asignar a todas sus posiciones valores que 
		// inician desde 1 y son secuenciales
		int Z[] = new int [12];
		Z[0] = 1;
		Z[1] = 2;
		Z[2] = 3;
		Z[3] = 4;
		Z[4] = 5;
		Z[5] = 6;
		Z[6] = 7;
		Z[7] = 8;
		Z[8] = 9;
		Z[9] = 10;
		Z[10] = 11;
		Z[11] = 12;
		
		//6. Declarar un vector J(10) y asignar a todas sus posiciones 
		// valores impares que inician desde 1 y son secuenciales
		int J[] = new int [10];
		J[0] = 1;
		J[1] = 3;
		J[2] = 5;
		J[3] = 7;
		J[4] = 9;
		J[5] = 11;
		J[6] = 13;
		J[7] = 15;
		J[8] = 17;
		J[9] = 19;
		
		//7. Declarar un vector H(10) y asignar solo a las posiciones 
		// impares letras que inician desde la A secuencialmente
		char H[] = new char [10];
		J[1] = 'A';
		J[3] = 'B';
		J[5] = 'C';
		J[7] = 'D';
		J[9] = 'E';
		
		//8. Declarar un vector F(10) y en base al ejercicio anterior asignar los 
		// valores de la siguiente manera: 
		// F[0] = H[3] 
		// F[3] = H[2]
		// F[4] = H[6] 
		// F[7] = H[0]
		// F[8] = H[1]
		// F[9] = H[9]
		char F[] = new char [10];
		F[0] = H[3];
		F[3] = H[2];
		F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];
		
		//9. Declarar un vector L(15) y asignar valores en base a lo siguiente: 
		// L[0] = (promedio de 3,5,7 y 9)            
		// L[4] = (la suma de 5,7,8 y 15) 
		// L[7] = (la multiplicación de 6,7 y 3) 
		// L[10] = (la división de 10/2) 
		int L[] = new int [15];
		L[0] = 6;
		L[4] = 35;
		L[7] = 126;
		L[10] = 5;
		
		//10. Declarar un vector N(12) y realizar las siguientes asignaciones
		// N[0] = (promedio de 3,10 y 9) 
		// N[4] = (la suma de 7,8 y 10)   
		// N[12] = (la multiplicación de 5,7 y 3) 
		// N[20] = (la suma de 7, -3 y 8)
		// en la última posición el valor de 20/4
		int N[] = new int [12];
		N[0] = 7;
		N[4] = 25;
		N[12] = 105; // Esta posición no existe y va a dar error
		N[20] = 12; // Esta posición no existe y va a dar error
		N[11] = 5; 
	}

}
