package curso.oo.lab05.ex3;

import java.util.Arrays;

public class TestaPassagemReferencia {

	public static void main(String[] args) {

	    //todo 1 - observe a criacao do array, ele é de tipo primitivo
		// criando um array de inteiros
		int[] i = { 10, 20, 30 };

		// Imprime valor de i
		System.out.println("inicia metodo main e i = " + Arrays.toString(i));

		// todo 2 - observe que é passado o array para o metodo
		// Chama método test que está definido abaixo,
		// e passa por referência o array de inteiro como um parâmetro.
		// Uma vez que um array é do tipo referência,
		// este argumento e passado
		// por referência.
		int []novoArray = test(i);
		System.out.println("Novo array: " + Arrays.toString(novoArray));

		// todo 4 - observer que o array foi alterado
		// imprime o valor de i. Note que o valor de i não muda
		System.out.println("termina o método main e i = " + Arrays.toString(i));
	}

	// Método estático na classe
	public static int[] test(final int[] j) {

		final int []arrayInterno = {44, 45, 46};
		
		System.out.println("inicia método test e j = " + Arrays.toString(j));

		// todo 3 - observe que são alterados posicoes do array
		// muda valor do parâmetro i

		System.out.println("termina método test e j = " + Arrays.toString(j));
		return arrayInterno;
	}

}
