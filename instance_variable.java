class Person {
    // Instance variables
    private String name;  // Each object will have its own 'name'
    private int age;      // Each object will have its own 'age'

    // Constructor to initialize instance variables
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Access instance variables through methods
        person1.displayDetails();  // Output: Name: Alice, Age: 25
        person2.displayDetails();  // Output: Name: Bob, Age: 30

        // Modify instance variables using setter methods
        person1.setName("Eve");
        person1.setAge(28);

        person1.displayDetails();  // Output: Name: Eve, Age: 28
    }
}
