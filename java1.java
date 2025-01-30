// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int age;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter age:");
        age = SC.nextInt();
        System.out.println("Enter weight:");
        double wt = SC.nextDouble();
        System.out.println("You are " + age +  " years old");
           System.out.println("You weight " + wt +  " kg");
    }
}