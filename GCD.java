class Main {
    public static void main(String[] args) {
        int n1 = 20, n2 = 30;

        // Applying Euclidean algorithm
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;  // Subtract the smaller number from the larger
            } else {
                n2 = n2 - n1;  // Subtract the larger number from the smaller
            }
        }

        // Now, n1 and n2 are equal, and that is the GCD
        System.out.println("GCD of 20 and 30 is: " + n1);
    }
}
