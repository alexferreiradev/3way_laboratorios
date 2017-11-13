package curso.oo.lab05.ex3;

public class TestaPassagemValor1 {

	public static void main(String[] args) {

		int i = 10;

		// Imprime valor de i
		System.out.println("inicia método main e i = " + i);

		// Chama método test, que está definido abaixo
		// e passa valor inteiro como um parâmetro. Uma vez que
		// int é um tipo primitivo, este argumento e passado
		// por valor.
		test(i);

		// imprime o valor de i, note que valor de i não muda
		System.out.println("termina o método main e i = " + i);
	}

	// Método estático na classe
	public static void test(int j) {

		System.out.println("inicia método test e j = " + j);

		// muda valor parâmetro i
		j = 33;
		System.out.println("termina método test e j = " + j);
	}

}
