package curso.oo.lab03;

import javax.swing.JOptionPane;


public class NumeroExtenso {

	public static void main(String[] args) {

		String msg = "";
		int input = 0;

		// Pega literal numérico de entrada e converte para int
		input = Integer.parseInt(JOptionPane.showInputDialog("Entre numero entre 1 e 10"));

		// Configura variável msg com string equivalente a entrada
		switch (input) {
			case 1:	msg = "um";	break;
			case 2:	msg = "dois";	break;
			case 3:	msg = "tres";	break;
			case 4:	msg = "quatro";	break;
			case 5:	msg = "cinco";	break;
			case 6:	msg = "seis";	break;
			case 7:	msg = "sete";	break;
			case 8:	msg = "oito";	break;
			case 9:	msg = "nove";	break;
			case 10: msg = "dez";	break;
			default:  msg = "Numero Invalido";

		}

		// Mostra número por extenso
		JOptionPane.showMessageDialog(null, msg);
	}

}
