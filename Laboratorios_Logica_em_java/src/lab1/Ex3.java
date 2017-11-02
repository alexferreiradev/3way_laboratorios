package lab1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// entrada = preco de custo + percentual
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o preco custo:");
		double precoCusto = sc.nextDouble();
		System.out.println("Digite o percentual:");
		float percentual = sc.nextFloat();

		// processamento = valor de venda
		double valorVenda = (percentual / 100 * precoCusto) + precoCusto;
		// saida = valor da venda
		// Forma de arredondar um valor 
		valorVenda = Math.round(valorVenda);
		System.out.println("Valor de venda = " + valorVenda);
	}

}
