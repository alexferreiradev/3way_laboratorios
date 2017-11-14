package curso.oo.lab04;

public class DiasDaSemanaResposta {

	public static void main(String[] args) {

        // todo 1 - Crie um array Bi-Dimencional para caber o total de dicionario e para cada linha tenha duas colunas, uma para português e outra para ingles
		String[][] dicionario = new String[][];

		// todo 2 - inicializa o array dicionario para cada linha de dia
        // Lembrando que deve conter em cada linha, o correspondente em português e ingles
        // Cada linha será uma entrada no dicionário nosso
        // Exemplo para Domingo:
		dicionario[0][0] = new String("Domingo");
		dicionario[0][1] = "Sunday";

        // imprime a traducao de portugues-ingles dos dias da semana
        System.out.println("\nPORTUGUES - INGLES");
        // todo 3 - altere para obter duas variaveis, um contador para percorrer as linhas e outro para colunas
        for (int i = 0; i < dicionario.length; i++) {
            // todo 4 - altere para mostrar o valor em português e outro em inglês
            // Lembrando que o Português é a primeira coluna e inglês o da segunda coluna
            System.out.println(dicionario[i] + " - " + dicionario[i]);
        }
	}
}
