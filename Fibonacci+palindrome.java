import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int f1 = 0, f2 = 1, f3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt(); // Number of terms to generate

        System.out.println("Fibonacci Series with Palindrome Check:");
        for (int i = 1; i <= n; i++) {
            // Print the Fibonacci number
            System.out.print(f1);

            // Check if the Fibonacci number is a palindrome
            if (isPalindrome(f1)) {
                System.out.print(" (Palindrome)");
            }
            System.out.println();

            // Generate the next number in the Fibonacci sequence
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        sc.close();
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int original = num; // Store the original number
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Build the reversed number
            num /= 10; // Remove the last digit
        }

        return original == reverse; // Check if original is equal to reversed
    }
}
