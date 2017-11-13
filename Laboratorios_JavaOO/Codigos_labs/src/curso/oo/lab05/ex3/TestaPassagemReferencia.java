package curso.oo.lab05.ex3;

import java.util.Arrays;

public class TestaPassagemReferencia {

	public static void main(String[] args) {

		// criando um array de inteiros
		int[] i = { 10, 20, 30 };

		// Imprime valor de i
		System.out.println("inicia metodo main e i = " + Arrays.toString(i));

		// Chama método test que está definido abaixo,
		// e passa por referência o array de inteiro como um parâmetro.
		// Uma vez que um array é do tipo referência,
		// este argumento e passado
		// por referência.
		test(i);

		// imprime o valor de i. Note que o valor de i não muda
		System.out.println("termina o método main e i = " + Arrays.toString(i));
	}

	// Método estático na classe
	public static void test(int[] j) {

		System.out.println("inicia método test e j = " + Arrays.toString(j));

		// muda valor do parâmetro i
		j[0] = 33;
		j[1] = 66;

		System.out.println("termina método test e j = " + Arrays.toString(j));
	}

}
