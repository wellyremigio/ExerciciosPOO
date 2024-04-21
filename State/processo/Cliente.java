package processo;

public class Cliente {

	public static void main(String[] args) {
		Processo processo = new Processo();
		processo.exception();
		processo.interruption();
		processo.interruption();
		processo.interruption();
		processo.exception();
		processo.interruption();
		//processo.exception();
	}

}
