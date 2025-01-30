abstract class Vehicle {
    // Abstract method
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
        // Creating a new Car object and assigning it to the reference variable 'Honda'
        Car Honda = new Car();
        
        // Calling methods using the 'Honda' reference
        Honda.fuel();  // Calls the fuel method from Vehicle
        Honda.move();  // Calls the move method from Car (implemented in Car)
    }
}
