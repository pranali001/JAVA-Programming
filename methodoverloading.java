class MathOperations {

    // Add two integers
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two integers: " + sum);
    }

    // Add three integers
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    // Add two floating-point numbers
    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of two floating-point numbers: " + sum);
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        
        // Calling the add method for two integers
        mathOps.add(2, 2);
        
        // Calling the add method for three integers
        mathOps.add(2, 2, 2);
        
        // Calling the add method for two floating-point numbers
        mathOps.add(2.1, 2.1);
    }
}
