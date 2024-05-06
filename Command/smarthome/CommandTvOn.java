package smarthome;

public class CommandTvOn implements Command{
	private Tv tv;

	public CommandTvOn(Tv tv) {
		this.tv = tv;
	}
	@Override
	public void execute() {
		tv.ligar();
	}

}
