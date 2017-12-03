package curso.oo.lab13.ex3;

public class DuasStrings {

	void print(String str1, String str2) {

		System.out.print(str1);
		try {
			Thread.sleep(500);
		} catch (InterruptedException ie) {
		    ie.printStackTrace();
		}

		System.out.println(str2);
	}

}
