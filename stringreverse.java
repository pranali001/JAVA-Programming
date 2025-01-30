// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    // Method to print the string
    static void hello() {
        String str = "HELLOOOO!!!!!!!!!"; // Storing the string
        System.out.println("Original String: " + str);
        
        // Reversing the string
        String reversedStr = reverseString(str);
        System.out.println("Reversed String: " + reversedStr);
    }
    
    // Method to reverse a string
    static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        hello(); // Call the hello method
        hello(); // Call the hello method again
    }
}
