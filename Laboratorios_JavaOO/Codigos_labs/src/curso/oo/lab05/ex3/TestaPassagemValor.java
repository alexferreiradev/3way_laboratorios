package curso.oo.lab05.ex3;

public class TestaPassagemValor {

	public static void main(String[] args) {

		int i = 10;

		// Imprime valor de i
		System.out.println("inicia método main e i = " + i);

		//cria variavel de teste como manda o exercicio
		int teste = 10;
		
		System.out.println("inicia método main e k = " + teste);
		
		// Chama método test, que está definido abaixo
		// e passa valor inteiro como um parâmetro. Uma vez que
		// int é um tipo primitivo, este argumento e passado
		// por valor.
		test(i, teste);

		// imprime o valor de i, note que valor de i não muda
		System.out.println("termina o método main e i = " + i);
		
		// imprime o valor de k, note que valor de k não muda
		System.out.println("inicia método main e k = " + teste);
	}

	// Método estático na classe
	public static void test(int j, int k) {

		System.out.println("inicia método test e j = " + j);

		// muda valor parâmetro j
		j = 33;
		System.out.println("termina método test e j = " + j);
		
		System.out.println("inicia método test e k = " + k);
		// muda valor parâmetro k
		k = 20;
		System.out.println("termina método test e k = " + k);
	}

}
