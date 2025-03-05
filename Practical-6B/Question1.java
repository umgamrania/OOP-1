class CustomThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Thread running...");
            System.out.println("Thread sleeping for 1000ms...");
            try {
                sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Interrupt while sleeping, returning");
                return;
            }
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
        CustomThread thread = new CustomThread();
        thread.start();
    }
}
