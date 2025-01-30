public class Main {
    public static void main(String[] args) {
        try {
        int a[]={2,3,5};
        System.out.println("Number are:"+ a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound!!");
        }
    }
}
