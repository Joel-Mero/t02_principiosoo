package deber.interfaz;

public class ConsultorioNorte implements ConsultorioInterfaz{

	public void solicitarDatos() {
		System.out.println("Pedir datos personales del paciente");
		System.out.println("Preguntar si el paciente tiene enfermedades");
		System.out.println("Preguntar si el paciente tiene alguna operación");
		System.out.println("Preguntar de alguna enfermedad en la familia");
		
	}

	public void darDiagnostibo() {
		System.out.println("Revisar estatura y peso");
		System.out.println("Revisar latidos");
		System.out.println("Revisar ojos, boca, etc.");
		System.out.println("Solcitar examnes de ser necesario");
		
	}

	public void realizarExamenes() {
		System.out.println("Llamar paciente el día indicado");
		System.out.println("Realizar el axamen indicado, de acuerdo al diagnostico");
	}

	public void entregarResultados() {
		System.out.println("Entregar resultados de examnes");
		System.out.println("Solicitar una nuevo consulta");
		
	}

	public void entregarRecetas() {
		System.out.println("En base a los examenes dar una receta adecuada");
	}

}
