import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt(); // Initial size of the array
        int[] a = new int[n + 10]; // Array with extra space for multiple insertions

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        while (true) { // Menu-driven loop
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Insertion
                    System.out.println("Enter the number to insert and its position:");
                    int num = sc.nextInt();
                    int pos = sc.nextInt();

                    // Shift elements to the right to make space for the new element
                    for (int j = n - 1; j >= pos - 1; j--) {
                        a[j + 1] = a[j];
                    }
                    a[pos - 1] = num; // Insert the element at the specified position
                    n++; // Increment size

                    System.out.println("Array after insertion:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2: // Deletion
                    System.out.println("Enter the position of the number to delete:");
                    int delPos = sc.nextInt();

                    // Shift elements to the left to remove the element at the specified position
                    for (int j = delPos - 1; j < n - 1; j++) {
                        a[j] = a[j + 1];
                    }
                    n--; // Decrement size

                    System.out.println("Array after deletion:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3: // Exit
                    System.out.println("Exiting the program.");
                    return;

                default: // Invalid choice
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
