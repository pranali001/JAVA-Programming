// Abstract class Vehicle
abstract class Vehicle {
    public abstract void move();  // Abstract method to be implemented by subclasses
}

// Concrete subclass Car
class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

// Concrete subclass Truck
class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("Truck is moving");
    }
}

// Concrete subclass Bike
class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }
}

// Main class to test the code
class Main {
    public static void main(String[] args) {
        // Creating objects of the subclasses and referencing them through Vehicle
        Vehicle myCar = new Car();   // Polymorphism: Vehicle reference, Car object
        Vehicle myTruck = new Truck(); // Polymorphism: Vehicle reference, Truck object
        Vehicle myBike = new Bike();  // Polymorphism: Vehicle reference, Bike object

        // Calling the move() method for each object
        myCar.move();   // Outputs: Car is moving
        myTruck.move();  // Outputs: Truck is moving
        myBike.move();   // Outputs: Bike is moving
    }
}
