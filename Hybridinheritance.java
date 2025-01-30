interface Animal {
    void eat();
}

interface Mammal {
    void walk();
}

class Dog implements Animal, Mammal {  // Implements two interfaces
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void walk() {
        System.out.println("The dog walks.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from Animal interface
        dog.walk(); // Method from Mammal interface
    }
}
