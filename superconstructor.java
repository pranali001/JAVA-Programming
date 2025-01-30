class Animal {
    Animal(String type) {
        System.out.println("Animal is a " + type);
    }
}

class Dog extends Animal {
    Dog(String type) {
        super(type); // Calls the parent class constructor
        System.out.println("Dog is a " + type);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Mammal");
    }
}
