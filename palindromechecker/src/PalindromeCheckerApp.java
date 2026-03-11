import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

/**
 * UC6: Queue + Stack Based Palindrome Checker
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String input = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Push and Enqueue characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        for (int i = 0; i < input.length(); i++) {

            char fromQueue = queue.remove(); // dequeue
            char fromStack = stack.pop();    // pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}