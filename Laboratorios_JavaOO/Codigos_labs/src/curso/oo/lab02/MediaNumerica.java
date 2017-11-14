package curso.oo.lab02;

public class MediaNumerica {

	public static void main(String[] args) {

		// declara numeros inteiros
		int num1 = 10;
		int num2 = 20;
		int numero3 = 45;

		// retorna a media numerica dos tres numeros
		// e salva-o na variavel media
		int media = ( num1 + num2 + numero3 ) / 3;

		// imprime na saída padrão
		System.out.println("numero 1 = " + num1);
		System.out.println("numero 2 = " + num2);
		System.out.println("numero 3 = " + numero3);
		System.out.println("media = " + media);
	}
}
