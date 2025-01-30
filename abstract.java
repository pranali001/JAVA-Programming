// Abstract class
abstract class Animal {
    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }

    // Abstract method (no body)
    public abstract void sound(); 
}

// Subclass implementing the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class directly
        // Animal a = new Animal(); // This will give an error

        // Instantiate a subclass
        Dog d = new Dog();
        d.eat();   // Calls concrete method from Animal
        d.sound(); // Calls implemented method from Dog
    }
}
