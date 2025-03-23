package newbeginning;

import java.util.Scanner;

public class PalindromeCheckRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        boolean isPalindrome = isPalindrome(input, 0, input.length() - 1);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (str.charAt(left) != str.charAt(right)) {
            return false; 
        }
        return isPalindrome(str, left + 1, right - 1);
   
	}

}
