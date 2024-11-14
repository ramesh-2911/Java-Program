package threading;

import java.util.Random;

public class RandomNumberThread extends Thread {
    private volatile boolean running = true; // Control flag
    Random num = new Random();
    int value;

    public void stopRunning() {
        running = false; // Set the flag to false to stop the loop
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle exception
            }
            value = num.nextInt(1000); // Generate a random number between 0 and 999
            System.out.println("RandomNumberThread generated a number: " + value);

            // Start SquareGenThread or CubeGenThread based on the value
            if (value % 2 == 0) {
                new SquareGenThread(value).start(); // Even number for square
            } else {
                new CubeGenThread(value).start(); // Odd number for cube
            }
        }
        System.out.println("RandomNumberThread has stopped."); // Notify when stopping
    }
}
