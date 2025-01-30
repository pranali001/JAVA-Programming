

import java.util.Scanner; 
class Main {
    public static void main(String[] args) {
   Scanner myobj= new Scanner(System.in);
   System.out.println("Enter a");
   int a = myobj.nextInt();
   System.out.println("A="+a);
  
  if(a>0){
      System.out.println("Number is Positive");
  }
  else if(a<0){
      System.out.println("Number is negative");
  }
  else if(a==0){
      System.out.println("Number is equal to 0");
  }
    }
}