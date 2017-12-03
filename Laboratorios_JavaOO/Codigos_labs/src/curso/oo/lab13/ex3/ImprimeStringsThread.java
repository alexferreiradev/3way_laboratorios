package curso.oo.lab13.ex3;

public class ImprimeStringsThread implements Runnable {

    private Thread thread;

    private String str1, str2;

    private DuasStrings ds = new DuasStrings();

    ImprimeStringsThread(String str1, String str2 ) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this, str1);
		this.ds = new DuasStrings();
	}

	public void run() {
//        System.out.println("entrei em run = " + thread.getName());
        // sincronizando sobre objeto DuasStrings
        synchronized (ds) {
//            System.out.println("entrei em syncronized = " + thread.getName());
            ds.print(str1, str2);
        }
    }

    public DuasStrings getDs() {
        return ds;
    }

    public Thread getThread() {
        return thread;
    }
}
