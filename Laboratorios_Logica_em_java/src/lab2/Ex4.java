package lab2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// entrada = 3 notas
		// Seria o prompt do java script
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da nota 1:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite o valor da nota 2:");
		double nota2 = sc.nextDouble();
		System.out.println("Digite o valor da nota 3:");
		double nota3 = sc.nextDouble();

		// processamento = calcular media
		double media = (nota1 + nota2 + nota3)/3;

		// saida = condicao do aluno (Reprovado, aprovado, recuperacao)
		if (media <= 5) {
			System.out.println("Reprovado");
		} else if (media > 5 && media < 7) {
			System.out.println("Recuperacao");
		} else {
			System.out.println("Aprovado");
		}
	}
}
