import java.util.Stack;

/**
 * UC5: Stack-Based Palindrome Checker
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Declare and initialize input
        String input = "level";

        // Create a stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            char popped = stack.pop();

            if (input.charAt(i) != popped) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}
