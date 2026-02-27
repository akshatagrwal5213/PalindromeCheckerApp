

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        scanner.close();
    }
}
