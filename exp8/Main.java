import java.io.File;
import java.util.Scanner;
import files.*;
public class Main {
public static void main(String[] args) {
String file_path = null;
Scanner input = new Scanner(System.in);
System.out.println("File Handler");
System.out.println("************");
System.out.println("Enter the file path");
file_path = input.next();
new UserFileHandler(file_path).fileDetails();
}
}