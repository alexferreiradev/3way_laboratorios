package curso.oo.lab03;

import javax.swing.JOptionPane;


public class NumeroExtenso1 {

	public static void main(String[] args) {

		String msg = "";
		int input = 0;

		// Pega literal numérico de entrada e converte para int
		input = Integer.parseInt(JOptionPane.showInputDialog("Entre numero entre 1 e 10"));

		// Configura variável msg com string equivalente a entrada
		    if(input == 1)    msg = "um";
		    else if(input == 2)  msg = "dois";
		    else if(input == 3)  msg = "tres";
		    else if(input == 4)  msg = "quatro";
		    else if(input == 5)  msg = "cinco";
		    else if(input == 6)  msg = "seis";
		    else if(input == 7)  msg = "sete";
		    else if(input == 8)  msg = "oito";
		    else if(input == 9)  msg = "nove";
		    else if(input == 10)  msg = "dez";
		    else  msg = "Numero Invalido";
		    
		// Mostra número por extenso
		JOptionPane.showMessageDialog(null, msg);
	}

}
