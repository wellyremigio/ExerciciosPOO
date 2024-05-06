package smarthome;

import java.util.*;

public class HouseControl {
	public List<DispositivoInterface> dispositivos;
	public Invoker invoker;
	
	public HouseControl() {
		this.dispositivos = new ArrayList<>();
		this.invoker = new Invoker();
	}
	
	public void adicionarDispositivo(DispositivoInterface dispositivo) {
		dispositivos.add(dispositivo);
	}
	
	public void removerDispositovo(DispositivoInterface dispositivo) {
		dispositivos.remove(dispositivo);
	}
	
	public void setCommand(Command command) {
		this.invoker.setCommand(command);
	}
	
	public void ligarTv(){
		this.invoker.executeAcao();
		notificar("ligou a tv");
	}
	
	public void desligarTv() {
		this.invoker.executeAcao();
		notificar("desligou a tv");
	}
	
	private void notificar(String msg) {
		for(DispositivoInterface d: dispositivos) {
			d.notificar(msg);
		}
	}
}
