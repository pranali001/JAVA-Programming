class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25); // Original object
        Person p2 = new Person(p1); // Copy constructor

        p1.display();
        p2.display();
    }
}
