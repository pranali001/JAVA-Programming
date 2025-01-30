// Abstract class with an abstract method
abstract class Animal {
    // Abstract method that must be implemented by subclasses
    public abstract void sound();
}

// Concrete class (subclass) that inherits from Animal
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

// Another concrete class (subclass) that inherits from Animal
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Using the reference of the superclass (Animal)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // The actual method to call is determined at runtime based on the object type
        myDog.sound();  // Outputs: Woof!
        myCat.sound();  // Outputs: Meow!
    }
}
