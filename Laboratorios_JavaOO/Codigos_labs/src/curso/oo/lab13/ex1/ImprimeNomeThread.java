package curso.oo.lab13.ex1;

// Subclass extends Thread class
public class ImprimeNomeThread extends Thread {

	public ImprimeNomeThread( String nome ) {

		super(nome);

		start();
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

	public static void main(String[] args) {

		// Cria instancia de uma classe que e
		// subclasse da classe Thread
		System.out.println("Criando instancia de ImprimeNomeThread...");
		ImprimeNomeThread pnt1 = new ImprimeNomeThread("A");
		ImprimeNomeThread pnt2 = new ImprimeNomeThread("B");
		ImprimeNomeThread pnt3 = new ImprimeNomeThread("C");

	}
}
