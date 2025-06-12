class Solution {
    // method to check sum of all prime numbers
    public int prime_Sum(int n) {
       int sum = 0;
       
       for(int i=2; i<=n; i++){
           if(isPrime(i)){
               sum+= i;
           }
       }
       return sum;
        
    }
    
    // method to check if a number is prime or not
    public static boolean isPrime(int n){
       if(n <= 1){
           return false;
       }
       
       for(int i=2; i <= Math.sqrt(n); i++){
           if(n % i == 0){
               return false;
           }
       }
       return true;
    }
}