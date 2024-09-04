import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String originalString = scanner.nextLine();

        // Call the method to check if the string is a palindrome
        boolean isPalindrome = isPalindrome(originalString);

        // Output the result
        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Remove all non-alphanumeric characters and convert the string to lowercase
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Check if the cleaned string is equal to the reversed string
        return cleanedString.equals(reversedString);
    }
}
