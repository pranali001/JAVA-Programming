// Define the interface
interface Animal {
    void makeSound(); // Abstract method
    void eat();       // Abstract method
}

// Implementing the interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphic reference
        dog.makeSound(); // Outputs: Dog barks!
        dog.eat();       // Outputs: Dog eats bones.
    }
}
