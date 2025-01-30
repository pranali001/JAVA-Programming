public class Main {
    public static void main(String[] args) {
        try {
            int divide= 10/0;
        } catch (ArithmeticException e) {
            System.out.println(" Can't Divide by zero!!");
        }
    }
}
