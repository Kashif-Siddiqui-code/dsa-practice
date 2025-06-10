class Solution {
    static boolean isPrime(int n) {
        // If 1 or less it is not prime
        
        if (n <= 1){
            return false;
        }
        
        // check divisibility from 2 to the square root of n
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}