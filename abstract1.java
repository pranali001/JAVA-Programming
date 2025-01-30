//Create an abstract class Vehicle with an abstract method start(). Create subclasses Car and Bike that provide implementation for the start() method.
abstract class Vehicle {
    abstract void start();
    
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car Started");
    }
}
class Bike extends Vehicle{
    void start(){
        System.out.println("Bike Started");
    }
}
  
class Main {
    public static void main(String[] args) {
Car c =new Car();
Bike b= new Bike();
c.start();
b.start();
    }
}