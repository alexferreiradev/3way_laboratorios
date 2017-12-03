package curso.oo.lab13.ex3;

public class ImprimeStringsThreadComJoin implements Runnable {

    private Thread thread;

    private String str1, str2;

	private DuasStrings ds = new DuasStrings();
    private ImprimeStringsThreadComJoin threadPai;

    private ImprimeStringsThreadComJoin(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this, str1);
	}

	ImprimeStringsThreadComJoin(String str1, String str2, ImprimeStringsThreadComJoin threadPai) {
		this(str1, str2);

		if (threadPai == null){
            this.threadPai = this;
        } else {
            this.threadPai = threadPai;
        }
        this.thread = new Thread(this, "thread:"+str1);
	}

	public void run() {
        try {
            if (threadPai != this){
                threadPai.getThread().join();
            }

//            System.out.println("Vou dormir um pouco = " + thread.getName());
            Thread.sleep(1000*3);
//            System.out.println("Fui notificada = " + thread.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ds.print(str1, str2);
    }

    public DuasStrings getDs() {
        return ds;
    }

    public Thread getThread() {
        return thread;
    }
}
