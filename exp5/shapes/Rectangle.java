package shapes;
import java.util.Scanner;

public class Rectangle extends Shape {
    double area = 0.0;

    @Override
    public void printArea() {  // No arguments
        System.out.println("\nRectangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);  // Scanner created inside the method
        System.out.println("Enter Length of Rectangle : ");
        this.length = input.nextDouble();
        System.out.println("Enter Breadth of Rectangle : ");
        this.hight = input.nextDouble();
        this.area = this.length * this.hight;
        System.out.println("Area of the Rectangle is : " + this.area);
    }
}
