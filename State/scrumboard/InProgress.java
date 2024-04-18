package scrumboard;

public class InProgress implements Estado{

	@Override
	public void moverEstado(String membroEquipe, UserStorie us) {
		if(membroEquipe.toLowerCase().equals("dev")) {
			us.setEstado(new ToVerify());
			System.out.println("US movida para o estado ToVerify");
		}else {
			System.out.println("Somente os desenvolvedores podem mover");
		}
	}
}
