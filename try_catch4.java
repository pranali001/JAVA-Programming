public class  {
    public static void main(String[] args) {
try {
    int result = 10 / 0; // ArithmeticException
} catch (NullPointerException e) {
    System.out.println("Null pointer exception occurred!");
} catch (Exception e) {
    System.out.println("Some other exception occurred!");
}
}
}
