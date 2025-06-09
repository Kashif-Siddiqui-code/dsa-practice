// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;
        
        while(n>0){
            int digit = n % 10; // extract the last digit from n
            n = n / 10;   // remove last digit from n
            sum = sum + (digit * digit * digit);
            
        }
        return sum == original;     // check if the original and sum is same
}
}