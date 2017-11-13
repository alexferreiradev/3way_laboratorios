package curso.oo.lab03;

import javax.swing.JOptionPane;

public class TestaFor {

	public static void main(String[] args) {

		// Declare e inicialize um array de String chamado nomes.
		String nomes[] = { "Beth", "Bianca", "Luis", "Bela", "Nico", "Ilza", "Geronimo", "Rafa" };

		// Esta string será procurada dentro do array
		String procuraNome = JOptionPane.showInputDialog("Digite \"Ilza\" ou \"sem nome\"!");

		// Declara e inicializa um variável boolean acheiNome.
		boolean acheiNome = false;

		// Procura no array de String usando o for.
		// O "nomes.length" retorna o tamanho do array.
		// Este for compara cada elemento do array com o valor de procuraNome que é do tipo String.
		// O método equals(...) da classe String é usado para comparar
		// Pense a respeito de você não poder utilizar
		// "nomes[i] == procuraNome" como lógica de comparação aqui
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals(procuraNome)) {
				acheiNome = true;
				break;
			}
		}

		// Mostra o resultado
		if (acheiNome)
			JOptionPane.showMessageDialog(null, procuraNome + " encontrado!");
		else
			JOptionPane.showMessageDialog(null, procuraNome + " não encontrado!");
	}

}
