
import java.util.Scanner;

public class PalindromeCheckerApp {

    static class Node {
        char data;
        Node next;
        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private static Node buildLinkedList(String word) {
        Node head = null, tail = null;
        for (int i = 0; i < word.length(); i++) {
            Node newNode = new Node(word.charAt(i));
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        return head;
    }

    private static Node reverse(Node head) {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    private static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node slow = head, fast = head;
        while (fast != null && fast.next != null)
        { slow = slow.next; fast = fast.next.next;
        } Node secondHalf = reverse(slow);
        Node firstHalf = head;
        while (secondHalf != null)
        { if (firstHalf.data != secondHalf.data)
        { return false; }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true; }
    public static void main(String[] args)
    { Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to check: ");
        String word = scanner.nextLine();
        Node head = buildLinkedList(word);
        if (isPalindrome(head))
        { System.out.println(word + " is a palindrome."); }
        else { System.out.println(word + " is not a palindrome."); }
        scanner.close();
    }
}