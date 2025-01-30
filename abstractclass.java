abstract class Animal {
    // Concrete method
    public void eat() {
        System.out.println("This animal eats food.");
    }
    
    // Abstract method (no implementation)
    public abstract void sound(); 
}

class Dog extends Animal {
    // Implementing the abstract method
    public void sound() {
        System.out.println("The dog barks.");
    }
}
