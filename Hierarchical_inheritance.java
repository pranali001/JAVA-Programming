class Animal {  // Parent class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {  // Child class 1
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {  // Child class 2
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog's own method

        Cat cat = new Cat();
        cat.eat();  // Inherited from Animal
        cat.meow(); // Cat's own method
    }
}
