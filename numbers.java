import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); // Read and initialize n

        for (int i = 1; i <= n; i++) {
            System.out.println("Number: " + i);
        }

        sc.close(); // Close the Scanner
    }
}
