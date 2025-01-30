public class SimpleExample {
    // A simple method to add two numbers
    public static int addNumbers(int a, int b) {
        return a + b; // Return the sum of two numbers
    }

    public static void main(String[] args) {
        int num1 = 5; // First number
        int num2 = 3; // Second number
        
        // Call the method and store the result
        int result = addNumbers(num1, num2);
        
        // Print the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
