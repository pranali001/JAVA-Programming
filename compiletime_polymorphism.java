class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum (2 params): " + calc.add(5, 10));
        System.out.println("Sum (3 params): " + calc.add(5, 10, 15));
    }
}
