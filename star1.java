class Main {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {      // Outer loop for rows
            for (j = 1; j <= 5; j++) {  // Inner loop for columns
                if (j <= 5 - i) {
                    System.out.print(" ");  // Print spaces
                } else {
                    System.out.print("*");  // Print stars
                }
            }
            System.out.println();       // Move to the next line after each row
        }
    }
}
