import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This will give the number of elements we want to work with e.g. 5
        int countofElements = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < countofElements; i++) {
            // Here you will enter the numbers equal to the countofElements
            int num = scanner.nextInt();
            // check for the numbers divisible by 6
            if (num % 6 == 0) {
                // Here we add the numbers that are divisible by 6
                sum += num;
            }
        }

        System.out.println(sum);
    }
}