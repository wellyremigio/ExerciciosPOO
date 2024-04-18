package scrumboard;

public class Done implements Estado{

	@Override
	public void moverEstado(String membroEquipe, UserStorie us) {
		System.out.println("A US já está feita");
		
	}
}
