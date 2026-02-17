
    /**
     *USE CASE 1- application entry and welcome message
     *
     *Description:
     * This class represents the entry point of
     * Palindrome Checker App
     *
     * At this stage the application  starts execution from main()
     * Displays Welcome message and shows application version
     *
     * No palindrome logic is implemented yet
     *The goal is to establish a clear startup flow
     *
     * @author Developer
     * @version 1.0
     *
     */
    public class PalindromeCheckerApp{
        /**
         * Application entry point
         * first method to be executed when program starts
         * @param args Command-line arguments
         */
        public static void main() {
            String input="madam";
            boolean isPalindrome=true;

            for (int i=0;i<input.length()/2; i++){
                if(input.charAt(i)!=input.charAt(input.length()-1-i)){
                    isPalindrome=false;
                    break;
                }
            }
            System.out.println("Input text = " +input);
            System.out.println("Is it a Palindrome? :"+ isPalindrome);
        }
    }

