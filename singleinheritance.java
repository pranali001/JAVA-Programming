class Animal {  // Parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {  // Child class
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Child class method
    }
}
