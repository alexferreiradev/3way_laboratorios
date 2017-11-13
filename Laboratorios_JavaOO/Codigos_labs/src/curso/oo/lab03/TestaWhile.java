package curso.oo.lab03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TestaWhile {

	public static void main(String args[]) {

		// declara variáveis inteiras
		int contadorNota, valorNota, total;

		// declara variável media double
		double media;
		total = 0;
		contadorNota = 1;

		// Classe Scanner utilizada para ler entrada de dados digitado pelo usuário
		Scanner leitor = new Scanner(System.in);

		System.out.println("Entre com 4 notas inteiras, ou valor negativo para sair");
		System.out.println("Digite nota(" + contadorNota + ") :");

		// lê o que o usuário digitou e converte para um int
		valorNota = leitor.nextInt();

		// Testa antes de entrar se valorNota que foi digitado é maior que um
		while (( valorNota > -1 )) {
			total += valorNota;
			if (contadorNota >= 4){
				break;
			}
			contadorNota++;
			System.out.println("Digite nota(" + contadorNota + ") :");
			valorNota = leitor.nextInt();
		}

		if (( contadorNota > 0 ) && ( valorNota > 0 )) {
			media = (double) total / contadorNota;

			// Usa DecimalFormat para formatar valor
			// double com 2 casas decimais
			DecimalFormat doisDigitos = new DecimalFormat("0.00");
			System.out.println("A média : " + doisDigitos.format(media));
		} else {
			System.out.println("Não inseriu nota ou leitura interrompida!");
		}
		System.exit(0);
	}

}
