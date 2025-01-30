class Main {
    public static void main(String[] args) {
        int n = 123456789, cnt = 0;
        
        // Loop to count digits
        while (n > 0) {
            n = n / 10;  // Remove the last digit
            cnt++;       // Increment the digit count
        }
        
        // Print the total number of digits
        System.out.println("Number of digits: " + cnt);
    }
}
