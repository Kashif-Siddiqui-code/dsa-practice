class Solution {
    public int smallestEvenMultiple(int n) {
        // If n is even then n is already multiple of 2 => return n
        // If n is odd, then the smallest multiple of both 2 and n is 2 * n
        if(n % 2 == 0){
            return n;
        } else{
            return n * 2;
        }
    }
}