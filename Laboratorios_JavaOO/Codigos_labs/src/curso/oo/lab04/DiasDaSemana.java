package curso.oo.lab04;


public class DiasDaSemana {

	public static void main(String[] args) {

		// Declara e inicializa um array de String contendo os dias da semana
		String[] dias = { "Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado" };

		// Mostra dias da semana com laço forEach/Enhenced for Java 5.0
		System.out.println("Mostra dias da Semana usando laço For-Each");
		for (String str : dias)
			System.out.print(str + " ");

		// Declara e inicializa um array de String contendo os dias da semana em Inglês
		// veja que para cada elemento você cria um objeto do tipo usado pelo array
		String[] days = new String[7];
		days[0] = new String("Sunday");
		days[1] = new String("Monday");
		days[2] = new String("Tuesday");
		days[3] = new String("Wednesday");
		days[4] = new String("Thursday");
		days[5] = new String("Friday");
		days[6] = new String("Saturday");

		// imprime a traducao de portugues-ingles dos dias da semana
		System.out.println("\nPORTUGUES - INGLES");
		for (int i = 0; i < dias.length; i++) {
			System.out.println(dias[i] + " - " + days[i]);
		}
	}

}
