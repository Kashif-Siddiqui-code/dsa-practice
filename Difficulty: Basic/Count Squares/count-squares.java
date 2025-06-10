// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // Find the square root of (n - 1) and convert to int (floor)
        return (int) Math.sqrt(n - 1);
    }
    public static void main(String[] args) {
        int n = 30;
        int result = countSquares(n);
        System.out.println(result);
    }
}