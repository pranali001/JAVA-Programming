public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
           System.out.println("String Length:"+ (str.length()));
           int a[]={2,3,5};
           System.out.println("Array:"+a[5]);
        } catch (NullPointerException e) {
            System.out.println("String is null Not Defined");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound!!");
        }
        }
    }
