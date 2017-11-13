package curso.oo.lab04;

import javax.swing.JOptionPane;

public class MaiorNumero {

	public static void main(String[] args) {

		int[] num = new int[10];
		int contador;
		int min = 0;
		int numerostotal = 3;

		// Pede ao usuário para digitar números
		for (contador = 0; contador < numerostotal; contador++) {

			num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com números até " + numerostotal + " no total"));

			// verifica se o número digitado é maior que max
			if (( contador == 0 ) || ( num[contador] < min ))
				min = num[contador];
		}

		// Mostra o menor número.
		JOptionPane.showMessageDialog(null, "O menor número é " + min);
	}

}
