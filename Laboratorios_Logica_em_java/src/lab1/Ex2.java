package lab1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// entrada
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o num 1:");
		int num1 = sc.nextInt();
		System.out.println("Digite o num 2:");
		int num2 = sc.nextInt();

		// processamento
		// soma, subtracao, multiplicacao, divisao
		// Utilizacao de operadores matematicos
		int soma = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int div = num1 / num2;
		
		// saida
		System.out.println("Soma=" + soma);
		System.out.println("Subtracao=" + sub);
		System.out.println("Multiplicacao=" + mult);
		System.out.println("Divisao=" + div);
	}

}
