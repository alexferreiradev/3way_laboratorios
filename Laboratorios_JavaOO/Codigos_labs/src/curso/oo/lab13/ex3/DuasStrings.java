package curso.oo.lab13.ex3;

public class DuasStrings {

	// este método não está synchronized
	synchronized static void print(String str1, String str2) {

		System.out.print(str1);
		try {
			// interrompe a thread
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		}

		System.out.println(str2);
	}

}
