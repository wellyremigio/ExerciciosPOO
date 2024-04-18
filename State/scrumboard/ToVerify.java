package scrumboard;

public class ToVerify implements Estado{

	@Override
	public void moverEstado(String membroEquipe, UserStorie us) {
		if(membroEquipe.toLowerCase().equals("scrum master")) {
			us.setEstado(new Done());
			System.out.println("US movida para o estado Done");
		}else {
			System.out.println("Somente o Scrum Master pode mover a US para o estado Done");
		}
	}
}
