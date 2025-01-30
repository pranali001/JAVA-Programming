class Counter {
    static int count = 0; // Static variable

    // Constructor increments count whenever an object is created
    Counter() {
        count++;
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter.displayCount(); // Prints the count
    }
}
