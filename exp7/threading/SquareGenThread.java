package threading;

public class SquareGenThread extends Thread {
    int number;
    int square; // Variable to store the square

    public SquareGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle exception
        }
        this.square = this.number * this.number; // Calculate the square
        System.out.println("SquareGenThread--> Square of " + number + " is " + square); // Correct message
    }
}
