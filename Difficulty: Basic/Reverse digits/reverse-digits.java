// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        int revNum = 0;
        
        while(n > 0){
            int lastDigit = n % 10; // extract last digit
            n = n/10; // remove last digit
            revNum = (revNum * 10) + lastDigit;
        }
        
        return revNum;
        
    }
}