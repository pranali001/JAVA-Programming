// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void makeSound();
}

// Subclass Dog extending Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog Barks!!!");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat Meows!!!!");
    }
}

// Main class to test the code
class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Animal dog = new Dog();  // Polymorphism: Animal reference, Dog object
        Animal cat = new Cat();  // Polymorphism: Animal reference, Cat object

        // Calling the makeSound() method
        dog.makeSound();  // Outputs: Dog Barks!!!
        cat.makeSound();  // Outputs: Cat Meows!!!!
    }
}
