// Abstract class (parent class)
abstract class Vehicle {
    // Abstract method (must be implemented by subclasses)
    public abstract void move();
    
    // Concrete method (can be inherited as is)
    public void fuel() {
        System.out.println("Filling up fuel.");
    }
}

// Concrete subclass (child class)
class Car extends Vehicle {
    // Implementing the abstract method from Vehicle class
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

class Main {
    public static void main(String[] args) {
        // You cannot create an instance of the abstract class Vehicle
        // Vehicle vehicle = new Vehicle(); // This would give an error
        
        // But you can create an instance of the subclass Car (which implements move())
        Car car = new Car();
        
        // Calling the methods
        car.fuel();  // Inherited from Vehicle
        car.move();  // Implemented in Car
    }
}
