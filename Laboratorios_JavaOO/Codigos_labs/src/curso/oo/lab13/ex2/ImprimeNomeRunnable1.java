package curso.oo.lab13.ex2;

public class ImprimeNomeRunnable1 implements Runnable {

	String nome;

	public ImprimeNomeRunnable1( String nome ) {

		this.nome = nome;
	}

	// implementacao do metodo run() da interface Runnable
	public void run() {

		for (int i = 0; i < 10; i++) {
			// sleep(1000); ERRO de compilação porque não herda Thread
			System.out.println(i + " : " + nome);
		}
	}

	public static void main(String[] args) {

		ImprimeNomeRunnable1 pntr1 = new ImprimeNomeRunnable1("RA");
		Thread t1 = new Thread(pntr1);
		t1.start();

		ImprimeNomeRunnable1 pntr2 = new ImprimeNomeRunnable1("RB");
		Thread t2 = new Thread(pntr2);
		t2.start();

		ImprimeNomeRunnable1 pntr3 = new ImprimeNomeRunnable1("RC");
		Thread t3 = new Thread(pntr3);
		t3.start();

	}
}
