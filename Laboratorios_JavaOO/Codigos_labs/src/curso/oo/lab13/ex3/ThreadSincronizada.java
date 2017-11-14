package curso.oo.lab13.ex3;

public class ThreadSincronizada {

	public static void main(String[] args) {

		new ImprimeStringsThread("Voce ", " aqui ?");
		new ImprimeStringsThread("Muito bem ", "obrigado!");
		new ImprimeStringsThread("Como voce ", " esta?");
	}
}
