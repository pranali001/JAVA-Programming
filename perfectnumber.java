class Main {
    public static void main(String[] args) {
      int n=28,i=1,sum=0;
      while(i<n){
          if(n%i==0)
          sum=sum+i;
          i++;
      }
      if(sum==n){
          System.out.println("Perfect number");
      }
      else{
          System.out.println("Not a perfect number");
      }
    }
}