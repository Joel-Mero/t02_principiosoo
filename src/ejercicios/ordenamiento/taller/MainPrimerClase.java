package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimerClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 primer dia de clase
		// El profesor nos da nuestro número lista

		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		danilo.setApellido("Alvarracin");
		danilo.setEdad(20);	

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);
		andres.setApellido("Pérez");
		andres.setEdad(19);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);
		alex.setApellido("Tipán");
		alex.setEdad(25);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);
		stefany.setApellido("Campo");
		stefany.setEdad(17);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);
		jhonny.setApellido("Conde");
		jhonny.setEdad(21);

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;
		
		// Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

		// Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));

	}

}
