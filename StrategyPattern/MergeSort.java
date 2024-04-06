package ordenacao;

import java.util.Arrays;

public class MergeSort implements OrdenacaoStrategy{
	@Override
	public void ordenar(int[] array) {
		Arrays.sort(array);
	}
}
