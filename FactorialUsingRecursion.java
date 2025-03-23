package newbeginning;

import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int number = scanner.nextInt(); 

        if (number >= 0) {
            long factorial = factorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        } else {
            System.out.println("Factorial is not defined for negative numbers.");
        }

        scanner.close(); 
    }
    public static long factorial(int n) {
        if (n <= 1) { 
            return 1;
        } else {
            return n * factorial(n - 1);
        
        }
    }
}


