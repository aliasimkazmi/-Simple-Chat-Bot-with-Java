import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int startNumber = scanner.nextInt();
        int endingNumber = scanner.nextInt();
        int product = 1;

        for (int counter = startNumber; counter < endingNumber; counter++) {
            // System.out.println(counter); To check which numbers are being multiplied.
            product = product * counter;
        }
        System.out.println(product);
    }
}