package curso.oo.lab13.ex3;

public class ImprimeStringsThread1 implements Runnable {

	Thread thread;

	String str1, str2;

	ImprimeStringsThread1( String str1, String str2 ) {

		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {

		DuasStrings1.print(str1, str2);
	}

}
