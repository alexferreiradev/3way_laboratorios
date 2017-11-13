package curso.oo.lab05.ex7;

public class TesteGetClass1 {

	public static void main(String[] args) {

		// Cria instância de objeto String
		String str1 = "A vida e para ser vivida... com Deus!";

		// Encontrar informação externa de uma instância de String
		// via método getClass(). Note que ele retorna uma instância
		// de objeto da classe Class
		Class str1Class = str1.getClass();
		System.out.println("A classe de str1 e uma instância de " + str1Class);

		// O nome da classe da instância de objeto Class.
		String str1ClassName = str1Class.getName();
		System.out.println("Nome da classe e " + str1ClassName);

		// Cria instância de objeto Integer
		Integer int1 = new Integer(34);

		// Encontrar informação externa de uma instância de Integer
		// via método getClass(). Note que ele retorna uma instância
		// de objeto da classe Class
		Class int1Class = int1.getClass();
		System.out.println("A classe de int1 é uma instância de " + int1Class);

		// O nome da classe da instância de objeto Class.
		String int1ClassName = int1Class.getName();
		System.out.println("Nome da classe é " + int1ClassName);

	}

}
