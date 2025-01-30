//A concrete method in an abstract class provides a common implementation that is shared by all subclasses. 

// Abstract class
abstract class Shape {
    double pi = 3.14;

    // Abstract method to calculate area
    public abstract void calculateArea();

    // Concrete method to display a generic message
    public void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    // Constructor for Circle
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        double area = pi * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, breadth;

    // Constructor for Rectangle
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class to test the code
class Main {
    public static void main(String[] args) {
        // Create Circle and Rectangle objects
        Shape circle = new Circle(5.0); // Circle with radius 5.0
        Shape rectangle = new Rectangle(4.0, 6.0); // Rectangle with length 4.0 and breadth 6.0

        // Display and calculate areas
        circle.displayShape();
        circle.calculateArea();

        rectangle.displayShape();
        rectangle.calculateArea();
    }
}
