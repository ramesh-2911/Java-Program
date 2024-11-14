import threading.RandomNumberThread;

public class Main {
    public static void main(String[] args) {
        RandomNumberThread randomThread = new RandomNumberThread();
        randomThread.start(); // Start the RandomNumberThread

        try {
            Thread.sleep(10000); // Let it run for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        randomThread.stopRunning(); // Stop the thread
    }
}
