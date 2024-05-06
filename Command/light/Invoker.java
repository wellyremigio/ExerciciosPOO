package light;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<Command> comandos;
	//private Command command;
	private CommandHistory historico;
	
	public Invoker() {
		this.comandos = new ArrayList<>();
		this.historico = new CommandHistory();
	}
	
//	public void setCommand(Command command) {
//		this.command = command;
//	}
	
	public void adicionarComandos(Command comando) {
		comandos.add(comando);
	}
	
	public void executarComandos() {
		for(Command c: comandos) {
			c.execute();
			historico.push(c);
		}
		comandos.clear();
	}
	
	public void desfazerComandos() {
		List<Command> lista = historico.pop();
		for (int i = lista.size()-1; i >= 0; i--) {
			lista.get(i).execute();
		}
	}
	
//	public void executeCommand() {
//		command.execute();
//		historico.push(command);
//	}
	
//	public String undoCommand() {
//		command.undo();
//		return historico.pop().toString();
//	}
}
