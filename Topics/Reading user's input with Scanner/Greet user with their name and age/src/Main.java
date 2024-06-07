import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = Integer.parseInt(sc.next());
        // Write your code for receiving user's name and age here.
        System.out.println("Welcome, " + name + "!" + " You are " + age + " years old.");
        // Print the message using the user's name and age.

    }
}