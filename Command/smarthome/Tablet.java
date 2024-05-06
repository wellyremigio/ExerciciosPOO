package smarthome;

public class Tablet implements DispositivoInterface{

	@Override
	public void notificar(String msg) {
		System.out.println("Tablet -> " + msg);
	}
}
