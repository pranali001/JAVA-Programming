class Main {
    public static void main(String[] args) {
        int a[] = {44, 77, 2, 90, 10}, i, j, t, min;
        for (i = 0; i < 4; i++) { // Outer loop for each pass
            min = i; // Assume current index is the minimum
            for (j = i + 1; j < 5; j++) { // Find the minimum element in the unsorted part
                if (a[j] < a[min]) {
                    min = j; // Update the index of the minimum element
                }
            }
            // Swap after finding the minimum
            t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

        // Print the sorted array
        for (i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
