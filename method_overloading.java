class Calculator {
    // Overloaded method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three integer parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with two double parameters
    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the add method with two integer parameters
        System.out.println(calculator.add(2, 3));  // Outputs: 5

        // Calling the add method with three integer parameters
        System.out.println(calculator.add(1, 2, 3));  // Outputs: 6

        // Calling the add method with two double parameters
        System.out.println(calculator.add(2.5, 3.5));  // Outputs: 6.0
    }
}
