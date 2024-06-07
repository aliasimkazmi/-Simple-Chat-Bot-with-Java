import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int numbersDivisiblebyN = 0;

        for (int i = a; i <= b; i++) {
            // System.out.println(i);
            if (i % n == 0) {
                ++numbersDivisiblebyN;
            } /*else {
                // The else block should be populated, but I am not sure what to put here.
                //System.out.printf("No numbers were divisible by %d \n",n) ;
            }*/
        }
        System.out.println(numbersDivisiblebyN);
    }
}