import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      // 0 1 1 2 3 5 8 13
      int f1=0, f2=1, f3, cnt=2;
      System.out.println(f1+" "+f2+" ");
      while(cnt<=8){
          f3=f1+f2;
          System.out.println(f3+" ");
          f1=f2;
          f2=f3;
          cnt++;
      }
    }
      }
