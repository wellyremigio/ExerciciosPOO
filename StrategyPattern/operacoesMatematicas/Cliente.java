package operacoesMatematicas;

public class Cliente {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		Contexto c = new Contexto(new Adicao());
		System.out.println("Adicao= "+ c.fazerOperacao(num1, num2));
		
		c.setOperacao(new Multiplicacao());
		System.out.println("Multiplicação= "+ c.fazerOperacao(num1, num2));
		
		c.setOperacao(new Subtracao());
		System.out.println("Subtração= "+ c.fazerOperacao(num1, num2));
	}

}
