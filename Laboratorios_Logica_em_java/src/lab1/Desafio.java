package lab1;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// entrada = custo de fabrica 
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fabrica:");
		double custoFabrica = sc.nextDouble();

		// processamento = preco final
		double valorComImpostos = (0.45 * custoFabrica);
		double valorDistribuidor = (0.28 * valorComImpostos) + custoFabrica;
		double valorFinal = custoFabrica + valorComImpostos + valorDistribuidor;

		// saida = valor final
		System.out.println("Valor da parcela = " + valorFinal);
	}

}
