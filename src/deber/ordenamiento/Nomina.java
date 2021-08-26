package deber.ordenamiento;

import java.util.Arrays;

public class Nomina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado susana = new Empleado();
		susana.setNombre("Susana");
		susana.setApellido("Anangonó");
		susana.setEdad(34);
		susana.setSalario(500.25);
		
		Empleado juan = new Empleado();
		juan.setNombre("Juan");
		juan.setApellido("Campo");
		juan.setEdad(40);
		juan.setSalario(500.50);
		
		Empleado luis = new Empleado();
		luis.setNombre("Luis");
		luis.setApellido("Díaz");
		luis.setEdad(36);
		luis.setSalario(780.25);
		
		Empleado diego = new Empleado();
		diego.setNombre("Diego");
		diego.setApellido("Maldonado");
		diego.setEdad(29);
		diego.setSalario(1500.00);
		
		Empleado hugo = new Empleado();
		hugo.setNombre("Hugo");
		hugo.setApellido("Anangonó");
		hugo.setEdad(34);
		hugo.setSalario(325.75);
		
		Empleado diana = new Empleado();
		diana.setNombre("Diana");
		diana.setApellido("López");
		diana.setEdad(28);
		diana.setSalario(1400.00);
		
		Empleado daniel = new Empleado();
		daniel.setNombre("Daniel");
		daniel.setApellido("Flores");
		daniel.setEdad(33);
		daniel.setSalario(475.75);
		
		Empleado sara = new Empleado();
		sara.setNombre("Sara");
		sara.setApellido("Rojas");
		sara.setEdad(29);
		sara.setSalario(800.00);
		
		Empleado ariel = new Empleado();
		ariel.setNombre("Ariel");
		ariel.setApellido("Torres");
		ariel.setEdad(30);
		ariel.setSalario(904.50);

		Empleado danna = new Empleado();
		danna.setNombre("Danna");
		danna.setApellido("Cortés");
		danna.setEdad(32);
		danna.setSalario(1304.00);
		
		Empleado nomina[] = new Empleado [10];
		nomina[0] = susana;
		nomina[1] = juan;
		nomina[2] = luis;
		nomina[3] = diego;
		nomina[4] = hugo;
		nomina[5] = diana;
		nomina[6] = daniel;
		nomina[7] = sara;
		nomina[8] = ariel;
		nomina[9] = danna;
		
		System.out.println("-----Empleados antes de ordenar su salario-----");
		System.out.println(Arrays.toString(nomina));

		Arrays.sort(nomina);
		System.out.println("-----Empleados despues de ordenar su salario-----");
		System.out.println(Arrays.toString(nomina));
		
	}

}
