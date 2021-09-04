package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tecladoInt=new Scanner(System.in);//TECLADO
		Scanner teclado=new Scanner(System.in);//TECLADO
		
		System.out.println("Ingrese información de Pasajero");
		System.out.println("Ingrese nombre");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese apellido");
		String apellido = teclado.nextLine();
		System.out.println("Ingrese edad");
		int edad = teclado.nextInt();
		System.out.println("Que tipo de pasajero es: 1:Pasajero Vip 2:Pasajero Eco");
		int opcion = tecladoInt.nextInt();
	
		String membresia="";
		String descuento="";
		if (opcion == 1 ) {
			System.out.println("Ingrese Código Membresía");
			membresia = teclado.nextLine();
		}else {
			System.out.println("Ingrese Código Descuento");
			descuento = teclado.nextLine();
			
		}
		
		PasajeroVip pasajero1 = new PasajeroVip(null, null, null, 0);
		pasajero1.setNombre(apellido);
		pasajero1.setApellido(nombre);
		pasajero1.setCodigoMembresia(membresia);
		pasajero1.setEdad(edad);
		
		PasajeroVip pasajero2 = new PasajeroVip("nombre" , "cruz" , "374t7" , 12);
				
		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Juan");
		pasajeroEconomico1.setApellido("Maldonado");
		pasajeroEconomico1.setCodigoDescuento("7j377r");
		pasajeroEconomico1.setEdad(26);
		
		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("Juan2");
		pasajeroEconomico2.setApellido("Anangonó");
		pasajeroEconomico2.setCodigoDescuento("7377r");
		pasajeroEconomico2.setEdad(24);
		
		Pasajero [][] asientos = new PasajeroVip[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;

		
		int opcionSalir = 0;
		do {
			System.out.println("Ingrese datos del asiento, 0 CONTINUAR, -1 SALIR");
			opcionSalir = tecladoInt.nextInt();
			if (opcionSalir == 0) {
				System.out.println("Ingrese fila del asiento");
				int fila = tecladoInt.nextInt();
				System.out.println("Ingrese columna del asiento");
				int columna = tecladoInt.nextInt();
				
				System.out.println("Los datos del pasajeroson:");
				System.out.println(asientos[fila][columna]);
			}else if (opcionSalir == -1){
				System.out.println("Va a salir del Sistema");
			}
			
		}while(opcionSalir != -1);
	
		
	}

}
