// User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        
        int original = n;
        int revNum = 0;
        
        while(n>0){
            int lastDigit = n % 10;
            n = n / 10;
            revNum = (revNum * 10) + lastDigit;
        }
        if(original == revNum){
            return true;
        } else{
            return false;
        }
        
    }
}