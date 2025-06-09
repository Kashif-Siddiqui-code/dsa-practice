// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
    
       int count = 0;
       int original = n;
       
       while(n>0){
           int digit = n % 10; // gives the last digit of n
           
           if(digit != 0 && original % digit == 0){
               count++;
           }
           n = n/10; //remove the last digit from n
           
       }
       return count;
        
    }
}