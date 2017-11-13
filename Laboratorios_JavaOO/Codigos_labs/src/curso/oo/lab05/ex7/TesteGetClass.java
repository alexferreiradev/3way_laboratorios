package curso.oo.lab05.ex7;

import java.util.Date;

public class TesteGetClass {

	public static void main(String[] args) {

		// Cria instância de objeto Date
		Date dt1 = new Date();

		// Encontrar informação externa de uma instância de Date
		// via método getClass(). Note que ele retorna uma instância
		// de objeto da classe Class
		Class dt1Class = dt1.getClass();
		System.out.println("A classe de dt1 e uma instância de " + dt1Class);

		// O nome da classe da instância de objeto Class.
		String dt1ClassName = dt1Class.getName();
		System.out.println("Nome da classe e " + dt1ClassName);

	}

}
