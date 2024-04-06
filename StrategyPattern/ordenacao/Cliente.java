package ordenacao;

import java.util.Arrays;

public class Cliente {
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new BubbleSort());
		int[] array = {5641,112,475,254,2255};
		contexto.ordenar(array);
		System.out.println("Array 1: "+ Arrays.toString(array));
		
		
		int[] array2 = {5641,112,475,254,2255};
		contexto.setOrdenacao(new QuickSort());
		contexto.ordenar(array2);
		System.out.println("Array 2: "+Arrays.toString(array2));
		
		
		int[] array3 = {5641,112,475,254,2255};
		contexto.setOrdenacao(new SelectionSort());
		contexto.ordenar(array3);
		System.out.println("Array 3: "+Arrays.toString(array3));
		
		int[] array4 = {5641,112,475,254,2255};
		contexto.setOrdenacao(new MergeSort());
		contexto.ordenar(array4);
		System.out.println("Array 4: "+Arrays.toString(array4));
	}
}
