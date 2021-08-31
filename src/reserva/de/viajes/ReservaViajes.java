package reserva.de.viajes;

import java.util.Scanner;

public class ReservaViajes extends Pasajero{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adolecente pasajero1 = new Adolecente();
		pasajero1.setNombre("Juan");
		pasajero1.setApellido("Guerrero");
		pasajero1.setDeportePractica("Fútbol");
		
		Adolecente pasajero2 = new Adolecente();
		pasajero2.setNombre("Luis");
		pasajero2.setApellido("Maldonado");
		pasajero2.setDeportePractica("Fútbol");
		
		Adolecente pasajero3 = new Adolecente();
		pasajero3.setNombre("Hugo");
		pasajero3.setApellido("Vásquez");
		pasajero3.setDeportePractica("Boley");
		
		Adolecente pasajero4 = new Adolecente();
		pasajero4.setNombre("Susana");
		pasajero4.setApellido("Anangonó");
		pasajero4.setDeportePractica("Básquet");
		
		Adolecente pasajero5 = new Adolecente();
		pasajero5.setNombre("Diana");
		pasajero5.setApellido("Córdova");
		pasajero5.setDeportePractica("Básquet");
		
		Adolecente pasajero6 = new Adolecente();
		pasajero6.setNombre("Diego");
		pasajero6.setApellido("Montufar");
		pasajero6.setDeportePractica("Natación");
		
		Adolecente pasajero7 = new Adolecente();
		pasajero7.setNombre("Danna");
		pasajero7.setApellido("Llumiquinga");
		pasajero7.setDeportePractica("Tenis");
		
		Adolecente pasajero8 = new Adolecente();
		pasajero8.setNombre("Juan");
		pasajero8.setApellido("Guerrero");
		pasajero8.setDeportePractica("Fútbol");
		
		Adolecente pasajero9 = new Adolecente();
		pasajero9.setNombre("Juan");
		pasajero9.setApellido("Guerrero");
		pasajero9.setDeportePractica("Fútbol");
		
		Adolecente pasajero10 = new Adolecente();
		pasajero10.setNombre("Juan");
		pasajero10.setApellido("Guerrero");
		pasajero10.setDeportePractica("Fútbol");
		
		Adulto pasajero11 = new Adulto();
		pasajero11.setNombre("Marcelo");
		pasajero11.setApellido("Maldonado");
		pasajero11.setCodigoSeguroSocial(12434);
		pasajero11.setEmpresaTrabjo("CDP");
		
		Adulto pasajero12 = new Adulto();
		pasajero12.setNombre("Marcelo");
		pasajero12.setApellido("Maldonado");
		pasajero12.setCodigoSeguroSocial(12434);
		pasajero12.setEmpresaTrabjo("CDP");
		
		Adulto pasajero13 = new Adulto();
		pasajero13.setNombre("Marcelo");
		pasajero13.setApellido("Maldonado");
		pasajero13.setCodigoSeguroSocial(12434);
		pasajero13.setEmpresaTrabjo("CDP");
		
		Adulto pasajero14 = new Adulto();
		pasajero14.setNombre("Marcelo");
		pasajero14.setApellido("Maldonado");
		pasajero14.setCodigoSeguroSocial(12434);
		pasajero14.setEmpresaTrabjo("CDP");
		
		Adulto pasajero15 = new Adulto();
		pasajero15.setNombre("Marcelo");
		pasajero15.setApellido("Maldonado");
		pasajero15.setCodigoSeguroSocial(12434);
		pasajero15.setEmpresaTrabjo("CDP");
		
		Adulto pasajero16 = new Adulto();
		pasajero16.setNombre("Marcelo");
		pasajero16.setApellido("Maldonado");
		pasajero16.setCodigoSeguroSocial(12434);
		pasajero16.setEmpresaTrabjo("CDP");
		
		Adulto pasajero17 = new Adulto();
		pasajero17.setNombre("Marcelo");
		pasajero17.setApellido("Maldonado");
		pasajero17.setCodigoSeguroSocial(12434);
		pasajero17.setEmpresaTrabjo("CDP");
		
		Adulto pasajero18 = new Adulto();
		pasajero18.setNombre("Marcelo");
		pasajero18.setApellido("Maldonado");
		pasajero18.setCodigoSeguroSocial(12434);
		pasajero18.setEmpresaTrabjo("CDP");
		
		Adulto pasajero19 = new Adulto();
		pasajero19.setNombre("Marcelo");
		pasajero19.setApellido("Maldonado");
		pasajero19.setCodigoSeguroSocial(12434);
		pasajero19.setEmpresaTrabjo("CDP");
		
		Adulto pasajero20 = new Adulto();
		pasajero20.setNombre("Marcelo");
		pasajero20.setApellido("Maldonado");
		pasajero20.setCodigoSeguroSocial(12434);
		pasajero20.setEmpresaTrabjo("CDP");
		
		Pasajero pasajero[][] = new Pasajero[4][5];
		pasajero[0][0] = pasajero11;
		pasajero[0][1] = pasajero12;
		pasajero[0][2] = pasajero13;
		pasajero[0][3] = pasajero14;
		pasajero[0][4] = pasajero15;
		pasajero[3][0] = pasajero16;
		pasajero[3][1] = pasajero17;
		pasajero[3][2] = pasajero18;
		pasajero[3][3] = pasajero19;
		pasajero[3][4] = pasajero20;
		
		pasajero[1][0] = pasajero11;
		pasajero[1][1] = pasajero12;
		pasajero[1][2] = pasajero13;
		pasajero[1][3] = pasajero14;
		pasajero[1][4] = pasajero15;
		pasajero[2][0] = pasajero16;
		pasajero[2][1] = pasajero17;
		pasajero[2][2] = pasajero18;
		pasajero[2][3] = pasajero19;
		pasajero[2][4] = pasajero20;
		
		System.out.println("Ingrese número de asiento ");
		System.out.println("Ingrese fila asiento ");
		Scanner teclado =new Scanner(System.in);//TECLADO
		int fila = teclado.nextInt();
		
		System.out.println("Ingrese culomna asiento ");
		int columna = teclado.nextInt();
		
		
	}

}
