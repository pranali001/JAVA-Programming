Inheritance
Definition: One class can inherit properties and functions of another class.
Real-life Example: Father and Son → Son inherits properties of Father.


class Animal {  // Base Class
public:
    void eat() {
        cout << "This animal eats food.\n";
    }
};

class Dog : public Animal {  // Derived Class
public:
    void bark() {
        cout << "Dog barks.\n";
    }
};

int main() {
    Dog d1;
    d1.eat();  // Inherited function
    d1.bark();
    return 0;
}