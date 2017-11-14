package curso.oo.lab04;

public class UniArray1 {

	public static void main(String[] args) {

		// Declara e cria um array de int com tamanho 10
		int[] idades = new int[10];
		
		idades[0]=31;
		idades[1]=32;
		idades[2]=33;
		idades[3]=34;
		idades[4]=35;
		idades[5]=36;
		idades[6]=37;
		idades[7]=38;
		idades[8]=39;
		idades[9]=40;

		// Imprime o valor de cada elemento do array
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
