class Solution {
    public static void print_divisors(int n) {
        
        // If i is completely dividing n then it is a divisor of n
        
        for(int i=1; i<=n; i++){
            
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
