package curso.oo.lab05.ex4;

public class EscopoDeVariavel {

	public static void main(String[] args) {

		int var1 = 10;
		// var2 agora esta definida em todoo escopo do metodo main
		int var2 = 15;

		if (var1 < 100) {
			// int var2 = 20;
			var2 = 20;
		} else {
			// int var2 = 21;
			var2 = 21;
		}

		// Acesso a var1 é permitido, então não há erro de compilação.
		System.out.println("valor de var1 = " + var1);

		// Acesso a var2 agora é permitido, não há erro de compilação
		System.out.println("valor de var2 = " + var2);

	}

}
