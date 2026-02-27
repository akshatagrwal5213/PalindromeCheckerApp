

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static boolean isPalindromeRecursive(String word, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (word.charAt(left) != word.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(word, left + 1, right - 1); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        if (isPalindromeRecursive(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
