class Main {
    public static void main(String[] args) {
        int n = 50, i, j = 2;

  
        while (j <= n) {
            i = 2;

            while (i < j) {
                if (j % i == 0) {
                    break; 
                }
                i++;
            }

            
            if (i == j) {
                System.out.print(j + " ");
            }

            j++; 
        }
    }
}
