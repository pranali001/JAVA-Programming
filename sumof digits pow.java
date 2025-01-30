import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 0;
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int orgnum = n;
        while (orgnum > 0) {
            s++;
            orgnum = orgnum / 10;
        }
        orgnum = n;
        double sum = 0;
          while (orgnum > 0) {
            int p = orgnum % 10; 
            sum = sum + Math.pow(p, s);
            orgnum = orgnum / 10; 
        }
        if (sum == n) {
            System.out.println(n + " is equal to the sum of its digits raised to the power of " + s);
        } else {
            System.out.println(n + " is NOT equal to the sum of its digits raised to the power of " + s);
        }

        sc.close();
    }
}
