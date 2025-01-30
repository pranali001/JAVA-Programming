public class Main {
    public static void main(String[] args) {
        try {
            String str = "abc";
            int num = Integer.parseInt(str); // Invalid string to number conversion
        } catch (NumberFormatException e) {
            System.out.println("Exception: Invalid number format. Cannot convert string to number.");
        }
    }
}
