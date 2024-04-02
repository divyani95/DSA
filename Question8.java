public class Question8 {
    public static void main(String[] args) {
        Thread workerThread = new Thread(() -> {
            try {
                System.out.println("Worker thread is sleeping.");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Worker thread woke up.");
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });

        // Start the worker thread
        workerThread.start();

        // Main thread waits for a while
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        // Interrupt the worker thread
        workerThread.interrupt();
    }
}

