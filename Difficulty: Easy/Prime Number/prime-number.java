class Solution {
    static boolean isPrime(int n) {
        // code here
                // 1. Handle edge cases
        if (n <= 1) return false;   // 0,1 and negatives are not prime
        if (n <= 3) return true;    // 2 and 3 are prime

        // 2. Eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // 3. Check divisibility using 6k ± 1 optimization
        // Because all primes are of form 6k ± 1 (except 2 and 3)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }

        // 4. If no divisor found, it's prime
        return true;
        
    }
}