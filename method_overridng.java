// Parent class Animal
class Animal {
    // Method that can be overridden by subclasses
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding the sound method in the Dog class
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding the sound method in the Cat class
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Main class to demonstrate polymorphism
class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat, using Animal reference
        Animal myDog = new Dog();  // Animal reference, Dog object
        Animal myCat = new Cat();  // Animal reference, Cat object

        // Calling the sound() method on both objects
        myDog.sound();  // Outputs: Dog barks
        myCat.sound();  // Outputs: Cat meows
    }
}
