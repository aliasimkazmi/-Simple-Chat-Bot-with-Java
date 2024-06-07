import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int PeanutButterCups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        if(10 <= PeanutButterCups && PeanutButterCups <=20 && !weekend){
                System.out.println(true);
            }
        else System.out.println(15 <= PeanutButterCups && PeanutButterCups <= 25 && weekend);
    }
}