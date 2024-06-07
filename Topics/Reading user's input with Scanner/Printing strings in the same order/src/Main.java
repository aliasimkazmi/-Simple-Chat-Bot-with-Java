import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String greeting = scanner.next();
        String programmingLanguage = scanner.next();
        String time = scanner.next();
        String designation = scanner.next();

        System.out.println(greeting);
        System.out.println(programmingLanguage);
        System.out.println(time);
        System.out.println(designation);

    }
}