package scrumboard;

public class Cliente {
	public static void main(String[] args) {
		UserStorie us = new UserStorie();
		us.moverDeEstado("qualquer pessoa");
		us.moverDeEstado("DEV");
		us.moverDeEstado("SCRUM MASTER");
		us.moverDeEstado("qualquer coisa");
	}

}
