package curso.oo.lab05.ex7;

public class TestaInstanceOf {

	public static void main(String[] args) {

		// Criar objeto Long
		Long num = new Long(10L);

		// Checa se num é do tipo Number usando operador instanceof.
		boolean b1 = num instanceof Number;
		System.out.println("str1 é Number: " + b1);
		
		// Checa também se é do tipo Object.
		boolean b2 = num instanceof Object;
		System.out.println("str1 é Object: " + b2);

	}

}
