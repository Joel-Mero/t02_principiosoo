package deber.interfaz;

public class MatriculaESPE implements MatriculaInterfaz{
	
	public void solicitarDatos() {
		System.out.println("Ingresar datos personales");
		System.out.println("Ingresar datos de la madre");
		System.out.println("Ingresar datos del padre");
		System.out.println("Ingresar datos del domicilio");
		
	}

	public void pedirDocumentosImportantes() {
		System.out.println("Pedir copia de cédula");
		System.out.println("Pedir certificado de Bachiller");
		System.out.println("Pedir nota de prueba para igresar");
		
	}

	public void preguntarPaso() {
		System.out.println("Verificar en el sistema si paso el curso anterior");
		
	}

	public void preguntarProfesores() {
		System.out.println("Verificar si hay profesores disponibles");
		
	}

	public void solicitarPagar() {
		System.out.println("Solictar de ser necesario pagar el curso");
		
	}

	public void solicitarComprobantePago() {
		System.out.println("Adjuntar a los datos y documentos importantes el comprobante de pago");
		
	}
}
