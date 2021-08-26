package ejercicios.interfaz;

public class CajeroProdubanco implements CajeroInterfaz {

	public void solicitarTarjeta(String numero) {
		System.out.println("Insertar tarjeta");
	}

	public void solicitarClave(String clave) {
		System.out.println("Ingrese su clave personal");
		System.out.println("Verificar clave");
	}

	public void solicitarTipoTransaccion() {
		System.out.println("Eliga el tipo de transacción");
	}

	public void solicitarMonto(int monto) {
		System.out.println("Eliga el monto a retirar");
	}

	public void validarElSaldo() {
		System.out.println("Su saldo actual es:");
	}

	public void entregarDinero() {
		System.out.println("Retire su dinero");
	}

	public void realizarLaTransaccion() {
		System.out.println("Restar monto al saldo actual");
	}

	public void entregarRecibo() {
		System.out.println("Por favor, retire su resivo");
	}

}
