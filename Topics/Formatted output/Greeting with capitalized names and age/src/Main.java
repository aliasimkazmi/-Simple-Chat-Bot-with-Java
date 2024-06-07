import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first name
        String firstName = scanner.nextLine();
        // Here I have capitalized the first letter and then added the other letter in the string FirstName
        String capitalizedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);

        //String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
        // Read the last name
        String lastName = scanner.nextLine();
        // Here I have capitalized the first letter of LastName and then added the other letter in the string LastName
        String capitalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


        // Read the age as an integer
        int age = scanner.nextInt();

        // Print the greeting message
        System.out.printf(" Hello, %s %s. You are %d years old.", capitalizedFirstName, capitalizedLastName, age);
    }
}