package curso.oo.lab02;

public class MaiorValor {

	public static void main(String[] args) {

		// declare os numeros
		int num1 = 10;
		int num2 = 23;
		int num3 = 5;
		int max = 0;

		// determina o maior numero
		max = ( num1 > num2 ) ? num1 : num2;
		max = ( max > num3 ) ? max : num3;

		// imprimindo
		System.out.println("numero 1 = " + num1);
		System.out.println("numero 2 = " + num2);
		System.out.println("numero 3 = " + num3);
		System.out.println("O maior numero = " + max);
	}

}
