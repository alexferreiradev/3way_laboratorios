package curso.oo.lab05.ex6;

public class TesteIgualdadeInteger {

	public static void main(String[] args) {

		// Declara duas variáveis do tipo Integer, int1 e int2
		Integer int1, int2;

		// Inicializando as variáveis. Note que as variáveis contem
		// ponteiros para instância de mesmo objeto atual.
		int1 = 10;
		int2 = int1;

		// Mostra o valor das variáveis int1 e int2
		System.out.println("Integer1: " + int1);
		System.out.println("Integer2: " + int2);

		// Checa se int1 e int2 são o mesmo objeto para as duas variáveis
		// apontando para mesma instância de um objeto do tipo Integer
		System.out.println("Mesmo objeto? " + ( int1 == int2 ));

		// Reinicializa variável int2. Ela agora aponta para um nova
		// instância de objeto Integer
		int2 = new Integer(int1);

		// Mostra o valor das variáveis int1 e int2
		System.out.println("Integer1: " + int1);
		System.out.println("Integer2: " + int2);

		// Checa novamente se int1 e int2 são os mesmos
		// objetos para as duas variáveis
		// apontando para mesma instância de um objeto do tipo Integer
		System.out.println("Mesmo objeto? " + ( int1 == int2 ));

		// Checa se str1 e str2 tem o mesmo valor
		System.out.println("Mesmo valor? " + int1.equals(int2));

	}

}
