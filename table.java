import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the start number of the range: ");
        int start = sc.nextInt();

        System.out.print("Enter the end number of the range: ");
        int end = sc.nextInt();

        // Loop through the range
        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication table for " + i + ":");
            // Print multiplication table for each number in the range
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println(); // Add an empty line after each table
        }
    }
}
