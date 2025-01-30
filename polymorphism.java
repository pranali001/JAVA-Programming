Polymorphism
Definition: One function behaves differently based on the object.
Compile-time: Function Overloading
Runtime: Function Overriding
Real-life Example:
A Shape class → Circle and Rectangle calculate area differently.
   


#include<iostream>
using namespace std;

// Base class
class Shape {
public:
    virtual void area() {  // Virtual function
        cout << "Calculating area of a shape\n";
    }
};

// Derived classes
class Circle : public Shape {
public:
    void area() override {
        cout << "Area = 3.14 * r * r\n";
    }
};

class Rectangle : public Shape {
public:
    void area() override {
        cout << "Area = length * breadth\n";
    }
};

int main() {
    Shape* shape1;
    Circle circle;
    Rectangle rect;

    shape1 = &circle;
    shape1->area();  // Calls Circle's area

    shape1 = &rect;
    shape1->area();  // Calls Rectangle's area

    return 0;
}