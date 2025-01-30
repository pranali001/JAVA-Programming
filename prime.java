int count = 0;  // Track how many primes have been found
int j = 2;      // Start checking from 2

while (count < 5) {
    boolean isPrime = true;
    for (int i = 2; i < j; i++) {
        if (j % i == 0) {
            isPrime = false;
            break;
        }
    }
    
    if (isPrime) {
        System.out.print(j + " ");
        count++;  // Increment the count when a prime is found
    }
    
    j++;  // Move to the next number
}
