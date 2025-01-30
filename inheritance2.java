class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat");
    }
}

public class Main {
    public static void main(String[] args) {
        // Object of Animal class
        Animal animal = new Animal();
        animal.sound();

        // Object of Dog class
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        animal.sound();
        cat.sound();
    }
}
