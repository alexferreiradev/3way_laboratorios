package curso.oo.lab04;

public class BidArrayExercicio3 {

	public static void main(String[] args) {

		// Declara e inicializa um array de String contendo os dias da semana em Inglês e portugues
		String[][] dias = new String[7][2];
		dias[0][0] = new String("Domingo");
		dias[0][1] = new String("Sunday");

		dias[1][0] = new String("Segunda");
		dias[1][1] = new String("Monday");

		dias[2][0] = new String("Terca");
		dias[2][1] = new String("Tuesday");

		dias[3][0] = new String("Quarta");
		dias[3][1] = new String("Wednesday");

		dias[4][0] = new String("Quinta");
		dias[4][1] = new String("Thursday");

		dias[5][0] = new String("Sexta");
		dias[5][1] = new String("Friday");

		dias[6][0] = new String("Sabado");
		dias[6][1] = new String("Saturday");

		// imprime a traducao de portugues-ingles dos dias da semana
		System.out.println("\nPORTUGUES - INGLES");
		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.print(dias[i][j]);
				System.out.print(" / ");
			}
			System.out.print("\n");
		}
	}
}
