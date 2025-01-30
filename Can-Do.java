interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies in the sky.");
    }
}

class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane flies high.");
    }
}

public class Main {
    public static void main(String[] args) {
        Flyable bird = new Bird();
        Flyable airplane = new Airplane();

        bird.fly();       // Outputs: Bird flies in the sky.
        airplane.fly();   // Outputs: Airplane flies high.
    }
}
