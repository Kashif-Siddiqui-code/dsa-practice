// Given a number n, determine whether it is a prime number or not.
// Input: n = 7; Output: true;

public class PrimeNumber {
    public static void main(String[] args) {
       Solution sol = new Solution();
       boolean result = sol.isPrime(7);
       System.out.println(result);
    }
}

class Solution {
    static boolean isPrime(int n) {
        // If 1 or less it is not prime
        if (n <= 1){
            return false;
        }
        // check divisibility from 2 to the square root of n
        for(int i=2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}