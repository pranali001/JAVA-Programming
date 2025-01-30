// Define the interface
interface Animal {
    void makeSound(); // Abstract method
    void eat();       // Abstract method
}

// Class implementing the interface
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

// Class implementing the interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows!");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Polymorphic behavior
        Animal cat = new Cat();

        dog.makeSound(); // Outputs: Dog barks!
        dog.eat();       // Outputs: Dog eats bones.

        cat.makeSound(); // Outputs: Cat meows!
        cat.eat();       // Outputs: Cat eats fish.
    }
}
