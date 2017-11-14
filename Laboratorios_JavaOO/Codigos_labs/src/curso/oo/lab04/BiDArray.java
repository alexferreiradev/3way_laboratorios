package curso.oo.lab04;

public class BiDArray {

	public static void main(String[] args) {

		// Declara e cria um array de tres dimensões de int com tamanho 4x3x2
		int[][][] idades = new int[4][3][2];

		// Mostra numero de linhas e colunas
		System.out.println("idades.length =" + idades.length); //1 dimensao
		System.out.println("idades.length[1] =" + idades[1].length); //2 dimensao
		System.out.println("idades.length[1][1] =" + idades[1][1].length); //3 dimensao

		// Imprime o valor de cada elemento do array
		for (int i = 0; i < idades.length; i++) {
			System.out.println("\n Linha inicio " + i);

			for (int j = 0; j < idades[i].length; j++) {
				System.out.println("\n Coluna inicio " + i);
				
				for (int k = 0; k < idades[i][j].length; k++) {
					idades[i][j][k] = i + j + k;
					System.out.print(idades[i][j][k] + " ");
				}
			}
		}
	}

}
