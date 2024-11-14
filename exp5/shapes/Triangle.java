package shapes;

import java.util.Scanner;

public class Triangle extends Shape {
    double area = 0.0;

    @Override
    public void printArea() {  // No arguments
        System.out.println("\nTriangle");
        System.out.println("---------\n");
        Scanner input = new Scanner(System.in);  // Scanner created inside the method
        System.out.println("Enter Length of Triangle : ");
        this.length = input.nextDouble();
        System.out.println("Enter Height of Triangle : ");
        this.hight = input.nextDouble();
        this.area = 0.5 * this.length * this.hight;
        System.out.println("Area of the Triangle is : " + this.area);
    }
}
