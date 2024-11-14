class GenericMax {
    // Generic method to find the maximum element
    public <T extends Comparable<T>> void maxFinder(T[] array) {
        T max = array[0];  // Initialize max with the first element
        for (T element : array) {
            System.out.println(element);  // Print each element
            if (element.compareTo(max) > 0) {
                max = element;  // Update max if the current element is greater
            }
        }
        System.out.println("Max is: " + max);
    }
}

// Main class to test the GenericMax class
public class Main {
    public static void main(String[] args) {
        GenericMax max = new GenericMax();  // Create an instance of GenericMax

        // Integer array
        Integer[] numbers = {14, 3, 42, 5, 6, 10};

        // String array
        String[] strings = {"R", "Ra", "Raj"};

        // Find and print the max element in the Integer array
        max.maxFinder(numbers);

        // Find and print the max element in the String array
        max.maxFinder(strings);
    }
}
