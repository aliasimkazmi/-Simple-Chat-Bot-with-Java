import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int divisibleByThree = 3;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double arithmeticAverage = 0;
        int numbersDivisibleBy3 = 0;
        // start coding here
        for (int i = a; i <= b; i++) {
            if (i % divisibleByThree == 0) {
                numbersDivisibleBy3++;
                arithmeticAverage += i;
            }
        }
        System.out.println(arithmeticAverage / numbersDivisibleBy3);
    }
}
