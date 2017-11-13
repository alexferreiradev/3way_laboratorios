package curso.oo.lab03;

import javax.swing.JOptionPane;

public class MediaNota1 {

	public static void main(String[] args) {

		int notaIPD = 0;
		int notaIngles = 0;
		int notaFisica = 0;
		double media = 0;

		// Recebe dados do showInputDialog
		String snota;

		snota = JOptionPane.showInputDialog("Nota IPD entre 0 e 100!");
		notaIPD = Integer.parseInt(snota);
		snota = JOptionPane.showInputDialog("Nota Inglês entre 0 e 100!");
		notaIngles = Integer.parseInt(snota);
		snota = JOptionPane.showInputDialog("Nota Física entre 0 e 100");
		notaFisica = Integer.parseInt(snota);

		// Calcula média
		media = ( notaIPD + notaIngles + notaFisica ) / 3;

		// Realiza controle if & else
		if (media >= 60) {
			JOptionPane.showMessageDialog(null, "Estrelinhas! Sua media e " + media);
		} else {
			JOptionPane.showMessageDialog(null, "Sem estrelinha! Sua media e " + media);
		}

	}

}
