// Abstract class
abstract class Animal {
    // Concrete method (implemented)
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method (no implementation, must be overridden in subclass)
    public abstract void sound(); // Subclasses must implement this method
}

// Dog class that extends Animal
class Dog extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

// Cat class that extends Animal
class Cat extends Animal {
    // Providing implementation for the abstract method
    @Override
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly
        // Animal animal = new Animal();  // Error: Cannot instantiate the type Animal

        // Instantiate concrete subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call concrete methods (from Animal)
        dog.eat();
        cat.eat();

        // Call abstract methods (implemented in Dog and Cat)
        dog.sound();
        cat.sound();
    }
}
