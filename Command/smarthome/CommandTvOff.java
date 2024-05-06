package smarthome;

public class CommandTvOff implements Command{
	private Tv tv;
	
	public CommandTvOff(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.desligar();
	}
}
