import java.util.Scanner;

public class AreaCalculator {

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter length of rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = scanner.nextDouble();
                    double rectangleArea = calculateRectangleArea(length, width);
                    System.out.println("Area of rectangle: " + rectangleArea);
                    break;
                case 2:
                    System.out.print("Enter base of triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of triangle: ");
                    double height = scanner.nextDouble();
                    double triangleArea = calculateTriangleArea(base, height);
                    System.out.println("Area of triangle: " + triangleArea);
                    break;
                case 3:
                    System.out.print("Enter radius of circle: ");
                    double radius = scanner.nextDouble();
                    double circleArea = calculateCircleArea(radius);
                    System.out.println("Area of circle: " + circleArea);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
