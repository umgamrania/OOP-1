import java.util.LinkedList;
import java.util.Queue;

class Store {
    Queue<Integer> queue;
    
    Store() {
        queue = new LinkedList<>();
    }

    public synchronized void add(int item) throws Exception {
        while(queue.size() >= 5) {
            System.out.println("Store is full");
            wait();
        }

        queue.offer(item);
        System.out.println("Stored " + item);
        notify();
    }

    public synchronized void remove() throws Exception {
        if(queue.size() == 0) {
            System.out.println("Store empty");
            wait();
        }

        System.out.println("Removed " + queue.poll());
        notify();
    }
}

class Producer extends Thread {
    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        int item = 0;
        while(true) {
            try {
                store.add(item++);
                Thread.sleep(1000);
            } catch(Exception ignored) {}
        }
    }
}

class Consumer extends Thread {
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while(true) {
            try {
                store.remove();
                Thread.sleep(1500);
            } catch(Exception ignored) {}
        }
    }
}

public class Question6 {
    public static void main(String[] args) {
        Store s = new Store();
        Producer p = new Producer(s);
        Consumer c = new Consumer(s);

        p.start();
        c.start();
    }
}