// Abstract class
abstract class Vehicle {
    // Abstract method (no implementation)
    public abstract void move(); 

    // Concrete method (with implementation)
    public void fuel() {
        System.out.println("Filling up fuel.");
    }
}

// Subclass implementing the abstract class
class Car extends Vehicle {
    // Implementing the abstract method
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate the abstract class directly
        // Vehicle vehicle = new Vehicle(); // Error: Cannot instantiate the type Vehicle

        // Instantiate the subclass (Car)
        Car car = new Car();

        // Calling the concrete method from the abstract class
        car.fuel();  // This method is inherited from Vehicle
        
        // Calling the abstract method implemented in the subclass
        car.move();  // This method is implemented in Car
    }
}
