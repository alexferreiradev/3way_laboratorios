package curso.oo.lab05.ex6;

public class TestaIgualdadeObjetoResposta {

	public static void main(String[] args) {

		// Declara duas variáveis do tipo String, str1 e str2
		String str1, str2;

		// Inicializando as variáveis. Note que as variáveis contem
		str1 = "Viver sem Deus...não é viver!";
		// todo - altere str2 para conter o mesmo valor literal da str1 mas como nova instancia string
		str2 = str1;

		// Mostra o valor das variáveis str1 e str2
		System.out.println("String1: " + str1);
		System.out.println("String2: " + str2);

		// A notação "==", quando e usada com variáveis de referência,
		// se retornar true significa que as variáveis apontam para
		// mesma instância de um objeto, e se false não, são referencias diferentes

		// Checa se str1 e str2 são o mesmo objeto para as duas variáveis
		// apontando para mesma instância de um objeto do tipo String
		// todo observar o resultado
		System.out.println("Mesmo objeto? " + ( str1 == str2 ));

		// Checa se str1 e str2 tem o mesmo valor
		System.out.println("Mesmo valor? " + str1.equals(str2));
	}

}
