package light;

public class Main {

	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		LightOffCommand lightOff = new LightOffCommand(light);
		Invoker invoker = new Invoker();
		
		invoker.adicionarComandos(lightOn);
		invoker.adicionarComandos(lightOff);
//		invoker.adicionarComandos(lightOff);
//		invoker.adicionarComandos(lightOff);
		invoker.executarComandos();
		invoker.desfazerComandos();
//		invoker.setCommand(lightOn);
//		invoker.executeCommand();
		
		//System.out.println(invoker.undoCommand());
		//invoker.setCommand(lightOff);
		//invoker.executeCommand();
		//invoker.undoCommand();
	}
}
