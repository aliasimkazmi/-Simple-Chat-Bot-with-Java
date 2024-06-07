import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Getting the input from the user
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(input % 15 == 0 ? "FizzBuzz" : input % 3 == 0 ? "Buzz" : input % 5 == 0 ? "Fizz" : input);

    }
}
