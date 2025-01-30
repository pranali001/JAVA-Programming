import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int f1 = 0, f2 = 1, f3;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");  // User inputs how many terms
        int n = sc.nextInt();  // Number of terms

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.println(f1);  // Print the current term (f1)

            f3 = f1 + f2;  // Calculate the next term in the series
            f1 = f2;       // Update f1 to the value of f2
            f2 = f3;       // Update f2 to the new term (f3)
        }

        sc.close();
    }
}
