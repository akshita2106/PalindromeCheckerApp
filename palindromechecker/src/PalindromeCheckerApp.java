import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 13: Performance Comparison
 */
public class PalindromeCheckerApp {

    /**
     * Simple palindrome check using Stack
     */
    public static boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    /**
     * Application entry point for UC13
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "level";

        // Capture start time
        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        // Capture end time
        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}