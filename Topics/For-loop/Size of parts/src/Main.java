import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();

        int toBeFixed = 0;
        int toBeRejected = 0;
        int areReady = 0;
        int status = 0;
        for (int i = 0; i < numberOfParts; i++) {
            status = scanner.nextInt();
            if (status == 0) {
                areReady++;
            } else if (status == 1) {
                toBeFixed++;
            } else if (status == -1) {
                toBeRejected++;
            }
        }
        scanner.close();
        System.out.println(areReady + " " + toBeFixed + " " + toBeRejected);
    }
}