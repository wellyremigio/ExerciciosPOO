package scrumboard;

public class ToDo implements Estado{

	@Override
	public void moverEstado(String membroEquipe, UserStorie us) {
		us.setEstado(new InProgress());
		System.out.println("US movida para estado InProgress");
	}
}
