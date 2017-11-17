package curso.oo.lab05.ex4;

public class TresTiposDeVariaveis {

	// Exemplo de variável estática
	static String staticVariable = "Variável de classe, ou estática";

	// Exemplo de variável de instância
	String instanceVariable = "variável de instância";

	public static void main(String[] args) {
		String str = new String("teste");
		
		String localVariable = "variável local";
		System.out.println("Variável estática = " + instanciaVariable);
		System.out.println("Variável de instância = " + TresTiposDeVariaveis.staticVariable);
		System.out.println("Variável local = " + localVariable);

	}

}
