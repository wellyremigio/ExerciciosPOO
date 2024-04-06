package ordenacao;

import java.util.Arrays;

public class QuickSort implements OrdenacaoStrategy{
	@Override
	public void ordenar(int[] array) {
		Arrays.sort(array);
	}
}
