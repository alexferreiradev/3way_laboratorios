package curso.oo.lab05.ex5;

public class AutoBoxUnbox {

	public static void main(String[] args) {

		// cria uma instância de objeto Integer, autobox
		Integer intObjeto = 7801;

		// Converte de Integer para primitivo int, auto-unbox
		int intPrimitiva = intObjeto;
		System.out.println("int intPrimitiva = " + intPrimitiva);

		// Usando método estático da classe empacotadora Integer
		// para converter uma String para o tipo Integer, autobox
		String strInt = "65000";
		Integer intConvertida = Integer.parseInt(strInt);
		System.out.println("int intConvertida = " + intConvertida);

		// Converte Integer para primitivo int, autoUnbox
		int intPrimitiva2 = intConvertida;
		System.out.println("Integer intObjeto2 = " + intPrimitiva2);

	}

}
