import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOfDigits = 0;
        
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        // Calculate factorial of n
        int factorial = 1;
        for(int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        
        // Print the factorial
        System.out.println("Factorial of " + n + " is: " + factorial);
        
        // Sum of digits of the factorial
        while(factorial > 0) {
            int digit = factorial % 10;  // Extract the last digit
            sumOfDigits += digit;  // Add it to the sum
            factorial = factorial / 10;  // Remove the last digit
        }
        
        // Print the sum of the digits
        System.out.println("Sum of digits of the factorial is: " + sumOfDigits);
        
        sc.close();
    }
}
