// Abstract class
abstract class Animal {
    // Abstract method (to be implemented by subclasses)
    public abstract void makeSound();

    // Concrete method (common to all subclasses)
    public void sleep() {
        System.out.println("All animals need sleep.");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks!");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Meows!");
    }
}

// Main class to test the code
class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Calling abstract method (different for each subclass)
        dog.makeSound();  // Outputs: Dog Barks!
        cat.makeSound();  // Outputs: Cat Meows!

        // Calling concrete method (common to all subclasses)
        dog.sleep();  // Outputs: All animals need sleep.
        cat.sleep();  // Outputs: All animals need sleep.
    }
}
