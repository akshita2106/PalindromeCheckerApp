import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/**
 * CLASS - StackStrategy
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     * @param input input string to validate
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare stack with original
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * CLASS - DequeStrategy
 */
class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "madam";

        // Inject strategy at runtime
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new DequeStrategy();

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}