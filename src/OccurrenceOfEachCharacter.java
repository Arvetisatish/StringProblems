import java.util.HashMap;
import java.util.Scanner;

public class OccurrenceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample string to search within
        String str = "hlo bro vvooo";

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }

        // Print the character counts
        System.out.println("Occurrences of each character in the string:");
        for (char c : charCountMap.keySet()) {
            System.out.println("The character '" + c + "' occurs " + charCountMap.get(c) + " times.");
        }
    }
}
