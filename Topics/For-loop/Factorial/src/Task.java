// This is a fill blanks task. You can use this editor as a playground

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int factorial = 1;
        for (int i = 0; i < number; ) {
            System.out.println(i);
            factorial*=(++i);
        }
        scanner.close();
        System.out.println("Factorial of " + number + ": " + factorial);
    }
}

