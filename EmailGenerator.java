import java.util.Scanner;

public class EmailGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first name and last name from the user
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Generate the email address
        String email = generateEmail(firstName, lastName);

        // Display the email address
        System.out.println("Your email address is: " + email);
    }

    public static String generateEmail(String firstName, String lastName) {
        // Extract the first 3 letters of the first name
        String firstPart = firstName.substring(0, Math.min(firstName.length(), 3));

        // Extract the first 4 letters of the last name
        String lastPart = lastName.substring(0, Math.min(lastName.length(), 4));

        // Create the email address with a domain (you can change the domain as needed)
        String email = firstPart + "." + lastPart + "@gmail.com";

        return email;
    }
}
