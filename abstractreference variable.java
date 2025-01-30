abstract class Vehicle {
    // Abstract method (must be implemented by subclass)
    public abstract void move();
    
    // Concrete method
    public void fuel() {
        System.out.println("Filling up fuel.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
}

public class Main {
    public static void main(String[] args) {
        // The reference name is "car", but the type is "Car"
        Car car = new Car();  // "car" is the reference variable name
        car.fuel();  // Call concrete method from Vehicle
        car.move();  // Call implemented abstract method from Car
        
        // You can use any other valid name for the reference, like "myVehicle"
        Vehicle myVehicle = new Car();  // Here, "myVehicle" is the reference name
        myVehicle.fuel();  // You can still call fuel() because it's inherited from Vehicle
        myVehicle.move();  // You can call move() because it's implemented in Car
    }
}
