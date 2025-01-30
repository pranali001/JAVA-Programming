
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    int n=123, revno=0, d;
    while(n>0){
        d=n%10;
        revno=revno*10+d;
        n=n/10;
    }
    System.out.println("Revno:"+revno );
    
    }
      }
