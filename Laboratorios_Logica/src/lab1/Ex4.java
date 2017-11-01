package lab1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// entrada = valor da compra
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da compra:");
		double valorCompra = sc.nextDouble();
		
		// processamento = saber qual é o valor da parcela
		double valorParcela = valorCompra / 5;
		
		// saida = valor da parcela
		System.out.println("Valor da parcela = "+ valorParcela);
	}

}
