class Main {
    public static void main(String[] args) {
        int n = 123456789, d,num=0,cnt=0;
        while(n>0){
            d=n%10;
            num=d+cnt;
            cnt++;
            n=n/10;
        }
        System.out.println(num);
    }
}
