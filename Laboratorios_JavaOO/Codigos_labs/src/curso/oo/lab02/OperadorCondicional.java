package curso.oo.lab02;

public class OperadorCondicional {

	public static void main(String[] args) {

		// Declara e inicializa duas variáveies, uma variável do tipo String
		// chamado estado e a outra variável chamada grau do
		// tipo primitivo int
		String estado = "";
		int grau = 80;

		// pega estado do aluno.
		estado = ( grau >= 60 ) ? "Aprovado" : "Reprovado";

		// Imprime estado
		System.out.println(estado);
	}

}
