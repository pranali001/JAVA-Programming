class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void parentSound() {
        super.sound(); // Calls the parent class method
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();        // Calls Dog's overridden method
        dog.parentSound();  // Calls Animal's method
    }
}
