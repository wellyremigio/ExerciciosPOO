package light;

import java.util.*;

public class CommandHistory {
	private List<Command> historico;
	
	public CommandHistory() {
		this.historico = new ArrayList<>();
	}
	
	public void push(Command command) {
		historico.add(command);
	}
	
	public List<Command> pop() {
		return historico;
	}

}
