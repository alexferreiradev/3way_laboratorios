package curso.oo.lab05.ex1;

public class ClasseEObjeto {

	public static void main(String[] args) {

		// Para criar uma instância de uma classe use a palavra chave new
		// Por exemplo, para criar uma instância da classe String
		// procedemos como segue
		String strObjeto1 = new String("Este objeto e uma instância da classe String");
		System.out.println("estado da instância de strObjeto1 = " + strObjeto1);

		// A classe String e uma classe especial que permite a criação de uma
		// instância pela atribuição de um literal string. Nenhuma outra classe
		// em java permite este tipo de criação. Além disso para cada literal
		// string e criada uma única instância desta string
		String strObjeto2 = "Este objeto é uma instância da classe String";
		System.out.println("estado da instância de strObjeto2 = " + strObjeto2);

		// cria uma instância de objeto da classe Integer
		Integer intObjeto1 = new Integer(20);
		System.out.println("estado da instância de intObjeto1 = " + intObjeto1);

	}

}
