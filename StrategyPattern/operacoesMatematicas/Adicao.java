package operacoesMatematicas;

public class Adicao implements OperacaoStrategy{

	@Override
	public int calcular(int num1, int num2) {
		return num1+num2;
	}

}
