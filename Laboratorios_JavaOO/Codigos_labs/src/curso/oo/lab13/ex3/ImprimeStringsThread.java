package curso.oo.lab13.ex3;

public class ImprimeStringsThread implements Runnable {

	Thread thread;

	String str1, str2;

	DuasStrings ds = new DuasStrings();

	ImprimeStringsThread( String str1, String str2 ) {

		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}

	ImprimeStringsThread( String str1, String str2, DuasStrings ds ) {

		this.str1 = str1;
		this.str2 = str2;
		this.ds = ds;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {

		// sincronizando sobre objeto DuasStrings
		synchronized (ds) {
			ds.print(str1, str2);
		}
	}

}
