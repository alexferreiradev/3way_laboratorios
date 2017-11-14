package curso.oo.lab04;

import javax.swing.JOptionPane;

public class MaiorNumeroResposta {

	public static void main(String[] args) {

		int[] num = new int[10];
		int contador;
		// todo 1 - altere o nome para facilitar na leitura para menorNumero - Utilize o refactor da IDE (Peça ajuda)
		int max = 0;
		int numerostotal = 3;

		// Pede ao usuário para digitar números
		for (contador = 0; contador < numerostotal; contador++) {

			num[contador] = Integer.parseInt(JOptionPane.showInputDialog("Entre com números até " + numerostotal + " no total"));

            // todo 2 - dica: verifique esta condição
			if (( contador == 0 ) || ( num[contador] > max ))
				max = num[contador];
		}

        // todo 3 - Altere para mostrar o novo resultado
        // Objetivo: Mostrar o menor número digitado
		JOptionPane.showMessageDialog(null, "O maior número é " + max);
	}

}
