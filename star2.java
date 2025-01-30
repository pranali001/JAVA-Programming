class Main {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {      // Outer loop for rows
            for (j = 1; j <= i; j++) {  // Inner loop for columns
                System.out.print("*");  // Print stars on the same line
            }
            System.out.println();       // Move to the next line after each row
        }
    }
}
