package shapes;

import java.util.Scanner;

public class Circle extends Shape {
    double area = 0.0;

    @Override
    public void printArea() {  // No arguments
        System.out.println("\nCircle");
        System.out.println("-------\n");
        Scanner input = new Scanner(System.in);  // Scanner created inside the method
        System.out.println("Enter Radius of Circle : ");
        this.length = input.nextDouble();
        this.area = Math.PI * this.length * this.length;
        System.out.println("Area of the Circle is : " + this.area);
    }
}
