interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {  // Implements both interfaces
    public void eat() {
        System.out.println("The dog eats food.");
    }

    public void play() {
        System.out.println("The dog plays with a ball.");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Method from Animal interface
        dog.play(); // Method from Pet interface
    }
}
