class Division {
    public void divide(int a, int b) {
        try {
            int result = a / b; // Division operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Division division = new Division();
        division.divide(10, 2); // Valid division
        division.divide(10, 0); // Division by zero
    }
}
