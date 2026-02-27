

import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        char[] charArray = word.toCharArray();

        int left = 0;
        int right = charArray.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
