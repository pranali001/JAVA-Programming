class Animal {
    String name = "Animal";
}

class Dog extends Animal {
    String name = "Dog";

    void printNames() {
        System.out.println(name);       // Refers to the current class variable
        System.out.println(super.name); // Refers to the parent class variable
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printNames();
    }
}
