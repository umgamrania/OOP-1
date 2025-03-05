class Counter {
    public static int normalCount = 0;
    public static int priorityCount = 0;
}

class LowPriorityThread extends Thread {
    long startTime;
    LowPriorityThread() {
        startTime = System.currentTimeMillis();
    }

    public void run() {
        while(true) {
            if(System.currentTimeMillis() > startTime + 100) {
                break;
            }
            Counter.normalCount++;
        }
    }
}

class HighPriorityThread extends Thread {
    long startTime;

    HighPriorityThread() {
        startTime = System.currentTimeMillis();
    }

    public void run() {
        while(true) {
            if(System.currentTimeMillis() > startTime + 100) {
                break;
            }
            Counter.priorityCount++;
        }
    }
}


public class Question4 {
    public static void main(String[] args) throws InterruptedException {
        LowPriorityThread lpThread = new LowPriorityThread();
        HighPriorityThread hpThread = new HighPriorityThread();

        lpThread.setPriority(Thread.MIN_PRIORITY);
        hpThread.setPriority(Thread.MAX_PRIORITY);

        lpThread.start();
        hpThread.start();

        lpThread.join();
        hpThread.join();

        System.out.println("Low Priority Count = " + Counter.normalCount);
        System.out.println("High Priority Count = " + Counter.priorityCount);
    }
}
