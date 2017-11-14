package curso.oo.lab13.ex1;

// Subclass extends Thread class
public class ImprimeNomeThread1 extends Thread {

	public ImprimeNomeThread1( String nome ) {

		super(nome);
	}

	// Sobrescreve metodo run() da classe Thread.
	// Este metodo toma a execucao metodo start() for invocado
	public void run() {

		System.out.println("metodo run() da thread " + this.getName() + " e chamado");

		for (int i = 0; i < 10; i++) {

			try {
				sleep(1000);
				System.out.println(i + " : " + this.getName());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// Cria instancia de uma classe que e
	// subclasse da classe Thread
	public static void main(String[] args) {

		System.out.println("Criando instancia de ImprimeNomeThread...");

		ImprimeNomeThread1 minhaThread = new ImprimeNomeThread1("A");

		// Inicia thread pela invocacao do metodo start()

		System.out.println("Chamando metodo start() da thread " + minhaThread.getName());

		minhaThread.start();
	}
}
