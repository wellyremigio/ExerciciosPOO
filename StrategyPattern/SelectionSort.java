package ordenacao;

import java.util.Arrays;

public class SelectionSort implements OrdenacaoStrategy{
	@Override
	public void ordenar(int[] array) {
		Arrays.sort(array);
	}
}
