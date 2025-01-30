// Superclass Animal
class Animal {
    public void sound() {  // Concrete method in the superclass
        System.out.println("Animal makes a sound");
    }
}

// Subclass Dog overriding the sound() method
class Dog extends Animal {
    @Override
    public void sound() {  // Overriding the method
        System.out.println("Dog barks");
    }
}

// Subclass Cat overriding the sound() method
class Cat extends Animal {
    @Override
    public void sound() {  // Overriding the method
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat, using Animal reference
        Animal myDog = new Dog();  // Animal reference, Dog object
        Animal myCat = new Cat();  // Animal reference, Cat object

        // Calling the overridden sound() method on both objects
        myDog.sound();  // Outputs: Dog barks
        myCat.sound();  // Outputs: Cat meows
    }
}
