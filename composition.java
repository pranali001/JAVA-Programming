//Create a class Engine with attributes type and horsePower. Then create a class Car that has an Engine object as one of its attributes. Write a program to demonstrate composition.

class Engine {
    private String type;
    private int horsePower;

    // Constructor
    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    // Method to display engine details
    public void displayEngineDetails() {
        System.out.println("Engine Type: " + type);
        System.out.println("HorsePower: " + horsePower + " HP");
    }
}

class Car {
    private String brand;
    private String model;
    private Engine engine; // Composition: Car "has-a" Engine

    // Constructor
    public Car(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        engine.displayEngineDetails(); // Using the Engine object
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Engine object
        Engine engine = new Engine("V8", 500);

        // Create a Car object and associate it with the Engine
        Car car = new Car("Ford", "Mustang", engine);

        // Display car details (which include engine details)
        car.displayCarDetails();
    }
}


