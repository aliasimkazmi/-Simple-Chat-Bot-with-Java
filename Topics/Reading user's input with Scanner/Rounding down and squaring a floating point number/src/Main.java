import java.util.Scanner;  // necessary import statement

public class Main {

    public static void main(String[] args) {

        // Create new Scanner object for reading the input
        Scanner scanner = new Scanner(System.in);

        // Read a floating point number
        float floatNumber = scanner.nextFloat();

        // Round it down and square it
        int roundedNumber = (int) Math.floor(floatNumber);

        // Print the result
        int squaredRoundedNumber = roundedNumber * roundedNumber;
        System.out.println(squaredRoundedNumber);

        // Remember to close the scanner to prevent resource leaks
        scanner.close();
    }
}