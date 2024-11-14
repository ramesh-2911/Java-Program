package threading;

public class CubeGenThread extends Thread {
    int number;
    int cube; // Variable to store the cube

    public CubeGenThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle exception
        }
        this.cube = this.number * this.number * this.number; // Calculate the cube
        System.out.println("CubeGenThread--> Cube of " + number + " is " + cube); // Fix the output message
    }
}
