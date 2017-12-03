package curso.oo.lab05.ex3;

public class TestaPassagemValorResposta {

	public static void main(String[] args) {

		int i = 10;

		// Imprime valor de i
		System.out.println("inicia método main e i = " + i);

		//todo 5 - Observe que foi criada uma nova variavel do tipo primitivo, ela deve ser passada para o metodo test()
		//cria variavel de teste como manda o exercicio
		int teste = 10;
		
		System.out.println("inicia método main e k = " + teste);
		
		// Chama método test, que está definido abaixo
		// e passa valor inteiro como um parâmetro. Uma vez que
		// int é um tipo primitivo, este argumento e passado
		// por valor.

        // todo 5 - altera chamada para receber mais um parametro primitivo
		boolean nomeVar = true;
		test(i, nomeVar);

		// imprime o valor de i, note que valor de i não muda
		System.out.println("termina o método main e i = " + i);
		
		// todo 6 - Adiciona um sysout para mostrar o valor da variável "teste"
		System.out.println("Valor de nomeVar depois de test: " + nomeVar);
	}

    // todo 1 - altere o método para receber mais um parametro primitivo
	// Método estático na classe
	public static void test(int j, boolean test) {

		System.out.println("inicia método test e j = " + j);

		// muda valor parâmetro j
		j = 33 + 3;
		System.out.println("termina método test e j = " + j);

		// todo 2 - adicione um sysout para mostrar o valor do parametro adicionado
		System.out.println("inicia método test e parametro x = " + test);

        // todo 3 - adiciona uma alteração no parametro adicionado, como soma, adição, divisão
		test = false;
        // todo 4 - Mostra o novo valor do parametro adicionado
		System.out.println("termina método test e parametro x = " + test);
	}

}
