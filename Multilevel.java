class Animal {  // Grandparent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {  // Parent class
    void walk() {
        System.out.println("This mammal walks.");
    }
}

class Dog extends Mammal {  // Child class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Inherited from Animal
        dog.walk();  // Inherited from Mammal
        dog.bark();  // Dog's own method
    }
}
