class Circle {
    final double PI = 3.14159; // Final variable

    // Method to calculate area of a circle
    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea(5); // Example radius
    }
}
