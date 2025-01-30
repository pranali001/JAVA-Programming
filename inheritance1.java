class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Dog inherits Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Dog's own method
    }
}
