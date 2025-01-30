

import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
   Scanner myobj= new Scanner(System.in);
   System.out.println("Enter a");
   int a = myobj.nextInt();
   System.out.println("A="+a);
    System.out.println("Enter b");
   int b = myobj.nextInt();
   System.out.println("B="+b);
    System.out.println("Enter c");
   int c = myobj.nextInt();
   System.out.println("C="+c);
  if (a>b && a>c ){
      System.out.println("A is greater");

  }
  
 else if (b>a && b>c){
     System.out.println("B is greater");
 }
 else {
     System.out.println("C is greater");
 }
    }
}