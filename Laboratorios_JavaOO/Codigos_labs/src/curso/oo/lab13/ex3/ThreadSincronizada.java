package curso.oo.lab13.ex3;

public class ThreadSincronizada {

	public static void main(String[] args) throws InterruptedException {

        System.out.println("Iniciando threads com syncronized");
        Thread[] threads = startThreadComSyncronized();
        waitAllThread(threads);

        System.out.println("Iniciando threads com wait");
        threads = startThreadComWait();
        waitAllThread(threads);

        System.out.println("Iniciando threads com join");
        threads = startThreadComJoin();
        waitAllThread(threads);
    }

    private static void waitAllThread(Thread[] threads) throws InterruptedException {
        for (Thread thread : threads) {
            thread.join();
        }
    }

    private static Thread[] startThreadComJoin() {
        ImprimeStringsThreadComJoin t1 = new ImprimeStringsThreadComJoin("t1:Voce ", " aqui ?", null);
        ImprimeStringsThreadComJoin t2 = new ImprimeStringsThreadComJoin("t2:Como voce ", " esta?", t1);
        ImprimeStringsThreadComJoin t3 = new ImprimeStringsThreadComJoin("t3:Muito bem ", "obrigado!", t2);

        t3.getThread().start();
        t2.getThread().start();
        t1.getThread().start();

        return new Thread[]{t1.getThread(), t2.getThread(),t3.getThread() };
    }

    private static Thread[] startThreadComWait() {
        ImprimeStringsThreadComWait t1 = new ImprimeStringsThreadComWait("t1:Voce ", " aqui ?", null);
        ImprimeStringsThreadComWait t2 = new ImprimeStringsThreadComWait("t2:Como voce ", " esta?", t1);
        ImprimeStringsThreadComWait t3 = new ImprimeStringsThreadComWait("t3:Muito bem ", "obrigado!", t2);

        t3.getThread().start();
        t2.getThread().start();
        t1.getThread().start();

        return new Thread[]{t1.getThread(), t2.getThread(),t3.getThread() };
    }

    private static Thread[] startThreadComSyncronized() {
        ImprimeStringsThread t1 = new ImprimeStringsThread("t1:Voce ", " aqui ?");
        ImprimeStringsThread t2 = new ImprimeStringsThread("t2:Como voce ", " esta?");
        ImprimeStringsThread t3 = new ImprimeStringsThread("t3:Muito bem ", "obrigado!");

        t3.getThread().start();
        t2.getThread().start();
        t1.getThread().start();

        return new Thread[]{t1.getThread(), t2.getThread(),t3.getThread() };
    }
}
