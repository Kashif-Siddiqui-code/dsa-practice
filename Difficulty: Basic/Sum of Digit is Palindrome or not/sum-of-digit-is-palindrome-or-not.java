// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        int sum = 0, original;

        // Calculate digit sum
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        // Check if sum is a palindrome
        original = sum;
        int reversed = 0;
        while (sum > 0) {
            reversed = reversed * 10 + sum % 10;
            sum /= 10;
        }

        return original == reversed;
        
    }
}