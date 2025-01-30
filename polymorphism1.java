// Parent class Animal
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Animal reference, Dog object
        Animal myCat = new Cat();  // Animal reference, Cat object

        myDog.sound();   // Outputs: Dog barks
        myCat.sound();   // Outputs: Cat meows
    }
}
