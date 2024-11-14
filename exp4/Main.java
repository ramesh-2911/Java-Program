import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;
import shapes.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);  // Single Scanner object for the entire program
        int choice = 0;
        
        do {
            System.out.println("Finding Area");
            System.out.println("************");
            System.out.println("\n1. Rectangle" + "\n2. Triangle" + "\n3. Circle" + "\n4. Exit" + "\n\nEnter your choice: ");
            
            if (userInput.hasNextInt()) {
                choice = userInput.nextInt();
                userInput.nextLine();  // Clear the newline character left in the buffer after nextInt()
                
                switch (choice) {
                    case 1:
                        Shape rt = new Rectangle();
                        rt.printArea();  // No arguments passed
                        break;
                    case 2:
                        Shape tr = new Triangle();
                        tr.printArea();  // No arguments passed
                        break;
                    case 3:
                        Shape cr = new Circle();
                        cr.printArea();  // No arguments passed
                        break;
                    case 4:
                        System.out.println("\n\nThank You !!!");
                        break;
                    default:
                        System.out.println("Please enter a valid input");
                        break;
                }
            } else {
                System.out.println("Invalid input, please enter an integer.");
                userInput.next();  // Consume invalid input and move on
            }
        } while (choice != 4);

        userInput.close();  // Close the Scanner object here, after the loop ends
    }
}
