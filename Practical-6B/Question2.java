class Work extends Thread {
    int workTime;

    public Work(int time) {
        workTime = time;
    }

    public void run() {
        System.out.println("Thread: Working for " + workTime + " seconds");
        try {
            sleep(workTime * 1000);
        } catch(Exception e) {
            System.out.println("Exception while working");
        }
        System.out.println("Thread: Task with time " + workTime + " completed");
    }
}

public class Question2 {
    public static void main(String[] args) throws InterruptedException {
        Work task1 = new Work(1);
        Work task2 = new Work(3);

        System.out.println("Starting 2 tasks...");
        task1.start();
        task2.start();

        System.out.println("Waiting for task 2 to complete...");
        task2.join();
        System.out.println("Main function: Task 2 completed");

        System.out.println("Waiting for task 1 to complete...");
        task1.join();
        System.out.println("Main function: Task 1 completed");
    }
}
