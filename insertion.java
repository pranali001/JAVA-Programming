import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner for input

        System.out.println("How many numbers do you want to enter:");
        int n = sc.nextInt(); // Read the size of the array
        int[] a = new int[n + 1]; // Create an array with one extra space for insertion

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Fill the array with user input
        }

        System.out.println("Before insertion:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); // Print the original array
        }
        System.out.println();

        System.out.println("Enter the number to insert and position:");
        int num = sc.nextInt(); // Read the number to insert
        int pos = sc.nextInt(); // Read the position to insert

        // Shift elements to the right to make space for the new number
        for (int j = n - 1; j >= pos - 1; j--) {
            a[j + 1] = a[j];
        }

        // Insert the new number at the specified position
        a[pos - 1] = num;

        System.out.println("After insertion:");
        for (int i = 0; i <= n; i++) {
            System.out.print(a[i] + " "); // Print the array after insertion
        }
        System.out.println();
    }
}
