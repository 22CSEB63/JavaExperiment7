
import java.util.Scanner;
class CaesarCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the plaintext string from the user
        System.out.print("Enter a plaintext string: ");
        String plaintext = scanner.nextLine().toUpperCase();

        // Set the shift value (number of positions down the alphabet)
        int shift = 3; // You can change this value to any desired shift

        // Initialize a StringBuilder to store the ciphertext
        StringBuilder ciphertext = new StringBuilder();

        // Iterate through each character in the plaintext
        for (char c : plaintext.toCharArray()) {
            if (Character.isLetter(c)) {
                // Shift the character by 'shift' positions down the alphabet
                char shiftedChar = (char) (((c - 'A' + shift) % 26) + 'A');
                ciphertext.append(shiftedChar);
            } else {
                // Append non-alphabetic characters as is
                ciphertext.append(c);
            }
        }

        // Print the ciphertext
        System.out.println("The ciphertext string is: " + ciphertext);
    }
}
