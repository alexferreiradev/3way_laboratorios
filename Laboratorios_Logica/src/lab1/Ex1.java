package lab1;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// entrada
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o num 1:");
		int num1 = sc.nextInt();
		System.out.println("Digite o num 2:");
		int num2 = sc.nextInt();
		
		// processamento
		int soma = num1 + num2;
		// saida
		// Uso wrapper para converter um primitivo para String
		System.out.println("Soma = " + String.valueOf(soma));
	}

}
