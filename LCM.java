class Main {
    public static void main(String[] args) {
        int n1 = 20, n2 = 30;
        int originalN1 = n1, originalN2 = n2;

        // Find the GCD using Euclidean algorithm
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;  // Subtract smaller number from larger number
            } else {
                n2 = n2 - n1;  // Subtract smaller number from larger number
            }
        }
        
        // GCD is now the common value of n1 and n2
        int gcd = n1;

        // Calculate LCM using the formula
        int lcm = (originalN1 * originalN2) / gcd;
        
        // Output the result
        System.out.println("LCM of " + originalN1 + " and " + originalN2 + " is: " + lcm);
    }
}
