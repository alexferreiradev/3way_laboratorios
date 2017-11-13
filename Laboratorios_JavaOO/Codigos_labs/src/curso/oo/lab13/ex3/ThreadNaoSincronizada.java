package curso.oo.lab13.ex3;

public class ThreadNaoSincronizada {

	public static void main(String[] args) {

		new ImprimeStringsThread1("Voce ", " aqui ?");
		new ImprimeStringsThread1("Muito bem ", "obrigado!");
		new ImprimeStringsThread1("Como voce ", " esta?");
	}

}
