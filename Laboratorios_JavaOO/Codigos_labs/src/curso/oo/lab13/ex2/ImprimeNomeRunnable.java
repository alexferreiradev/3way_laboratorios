package curso.oo.lab13.ex2;

public class ImprimeNomeRunnable implements Runnable {

	Thread thread;

	public ImprimeNomeRunnable( String nome ) {

		thread = new Thread(this, nome);
		thread.start();

	}

	// implementacao do metodo run() da interface Runnable
	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				thread.sleep(1000); // Agora é permitido porque é uma thread
				System.out.println(i + " : " + thread.getName());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ImprimeNomeRunnable pntr1 = new ImprimeNomeRunnable("RA");
		ImprimeNomeRunnable pntr2 = new ImprimeNomeRunnable("RB");
		ImprimeNomeRunnable pntr3 = new ImprimeNomeRunnable("RC");

	}
}
