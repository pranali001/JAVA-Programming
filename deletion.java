import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Initialize Scanner for input

        System.out.println("How many numbers do you want to enter:");
        int n = sc.nextInt(); // Read the size of the array
        int[] a = new int[n]; // Create an array of size `n`

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); // Fill the array with user input
        }

        System.out.println("Before deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); // Print the original array
        }
        System.out.println();

        System.out.println("Enter the position of the number to delete:");
        int pos = sc.nextInt(); // Read the position to delete

        // Shift elements to the left to fill the gap
        for (int j = pos - 1; j < n - 1; j++) {
            a[j] = a[j + 1];
        }

        n--; // Decrease the size of the array (effectively)

        System.out.println("After deletion:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " "); // Print the array after deletion
        }
        System.out.println();
    }
}
