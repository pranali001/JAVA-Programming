#include<iostream>
using namespace std;

// Class (blueprint for cars)
class Car {
public:
    string color;  // Property
    string model;

    void start() {  // Function
        cout << "Car is starting\n";
    }
};

int main() {
    Car car1;  // Object 1
    car1.color = "Red";
    car1.model = "Sedan";

    cout << "Car color: " << car1.color << "\n";
    car1.start();

    return 0;
}
 