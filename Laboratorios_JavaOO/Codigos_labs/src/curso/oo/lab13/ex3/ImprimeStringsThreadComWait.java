package curso.oo.lab13.ex3;

public class ImprimeStringsThreadComWait implements Runnable {

    private Thread thread;

    private String str1, str2;

	private DuasStrings ds = new DuasStrings();
    private ImprimeStringsThreadComWait threadPai;

    private ImprimeStringsThreadComWait(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
		thread = new Thread(this, str1);
	}

	ImprimeStringsThreadComWait(String str1, String str2, ImprimeStringsThreadComWait threadPai) {
		this(str1, str2);

		if (threadPai == null){
            this.threadPai = this;
        } else {
            this.threadPai = threadPai;
        }
        this.thread = new Thread(this, "thread:"+str1);
	}

	public void run() {
//        System.out.println("entrei em run = " + thread.getName());
        // sincronizando sobre objeto DuasStrings
        synchronized (threadPai) {
//            System.out.println("entrei em syncronized = " + thread.getName());
            try {
                if (threadPai != this){
                    while(threadPai.getThread().isAlive()){
//                        System.out.println("Thread pai nao terminou, vou wait = t"+thread.getName());
                        threadPai.wait(1000);
//                        System.out.println("Acordei de wait = t"+thread.getName());
                    }
                }

//                System.out.println("Vou dormir um pouco = " + thread.getName());
                Thread.sleep(1000*3);
//                System.out.println("Fui notificada = " + thread.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            ds.print(str1, str2);
        }

        synchronized (this) {
//            System.out.println("Fui finaliza = " + thread.getName());
            this.notify();
        }
    }

    public DuasStrings getDs() {
        return ds;
    }

    public Thread getThread() {
        return thread;
    }
}
