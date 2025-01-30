class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // No need to override the sound() method in Dog class
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(); // Creating a Dog object
        dog.sound(); // Inherits the sound() method from Animal class
    }
}
