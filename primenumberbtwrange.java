import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the range
        System.out.print("Enter a: ");
        int a = sc.nextInt(); 
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        // Loop through the numbers from a to b
        for (int num = a; num <= b; num++) {
            boolean isPrime = true; // Assume the number is prime initially

            // Check if the number is divisible by any number between 2 and num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false; // num is divisible by i, so it's not prime
                    break; // No need to check further if a divisor is found
                }
            }

            // If num is prime, print it
            if (isPrime && num > 1) {
                System.out.println(num + " is a prime number.");
            }
        }

        sc.close();
    }
}
