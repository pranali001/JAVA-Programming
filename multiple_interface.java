// Define first interface
interface Animal {
    void makeSound();
}

// Define second interface
interface Pet {
    void play();
}

// Class implements multiple interfaces
class Dog implements Animal, Pet {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    @Override
    public void play() {
        System.out.println("Dog loves to play fetch!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Outputs: Dog barks!
        dog.play();      // Outputs: Dog loves to play fetch!
    }
}
