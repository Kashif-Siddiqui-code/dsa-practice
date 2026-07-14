class Solution {
    boolean isDigitSumPalindrome(int n) {
        int original = n;
        int sum = 0;
        
        while(n > 0){
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        
        original = sum;
        int revNum = 0;
        while(sum > 0){
            int lastDigit = sum % 10;
            sum = sum / 10;
            revNum = (revNum * 10) + lastDigit;
            
        }
        return original == revNum;
    }
}