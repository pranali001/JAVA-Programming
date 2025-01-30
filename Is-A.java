class Vehicle {
    void move() {
        System.out.println("This vehicle moves.");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("This car uses petrol.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.move(); // Inherited from Vehicle
        car.fuel(); // Defined in Car
    }
}
