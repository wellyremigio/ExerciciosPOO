package ordenacao;

import java.util.Arrays;

public class BubbleSort implements OrdenacaoStrategy{
	@Override
	public void ordenar(int[] array) {
		Arrays.sort(array);
	}
}
