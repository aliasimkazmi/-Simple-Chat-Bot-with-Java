import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        scanner.close();
        System.out.println(sum);

    }
}