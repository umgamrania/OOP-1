class IntegerWrapper {
    static int sum = 0;
}

class NormalThread extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++)
            IntegerWrapper.sum += 1;
    }
}

class SyncThread extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            synchronized(IntegerWrapper.class) {
                IntegerWrapper.sum += 1;
            }
        }
    }
}

public class Question3 {
    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];

        if(args.length > 0 && args[0].equals("sync")){
            for(int i = 0; i < 10; i++) threads[i] = new SyncThread();
        }
        else {
            for(int i = 0; i < 10; i++) threads[i] = new NormalThread();
        }

        for(Thread t : threads) {
            t.start();
        }

        for(Thread t : threads) {
            t.join();
        }

        System.out.println("Value = " + IntegerWrapper.sum);
    }
}
