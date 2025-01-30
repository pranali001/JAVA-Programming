
//To determine if a number is prime, the remainder should never be 0 for any division by numbers between 2 and sqrt(n) (or n-1 in simpler logic)
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = 4, i = 2;

        while (i < n) {
            if (n % i == 0) {
                break; // Exit the loop if a divisor is found
            }
            i++; // Increment `i` here to continue checking
        }

        // Check if `i` equals `n`, meaning no divisors were found
       if (i == n) {
            System.out.println("Prime No.");
        } else {
            System.out.println("Not Prime No.");
        }
    }
}
