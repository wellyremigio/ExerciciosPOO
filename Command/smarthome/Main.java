package smarthome;

public class Main {

	public static void main(String[] args) {
		Tv tv = new Tv();
		Command tvOn = new CommandTvOn(tv);
		Command tvOff = new CommandTvOff(tv);
		DispositivoInterface celular = new Celular();
		DispositivoInterface tablet = new Tablet();
		
		HouseControl h = new HouseControl();
		h.setCommand(tvOn);
		h.adicionarDispositivo(celular);
		h.adicionarDispositivo(tablet);
		h.ligarTv();
		h.setCommand(tvOff);
		h.desligarTv();
	}

}
