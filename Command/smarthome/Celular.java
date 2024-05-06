package smarthome;

public class Celular implements DispositivoInterface{

	@Override
	public void notificar(String msg) {
		System.out.println("Celular -> " + msg);
	}
}
