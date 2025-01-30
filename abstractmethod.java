abstract class Shape {
    // Abstract method, no implementation
    public abstract void draw(); 
}

class Circle extends Shape {
    // Providing implementation for abstract method
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    // Providing implementation for abstract method
    public void draw() {
        System.out.println("Drawing a square");
    }
}
