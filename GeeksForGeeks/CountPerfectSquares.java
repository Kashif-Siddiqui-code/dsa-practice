// Given a positive integer n, find the number of perfect squares that are less than n in the sample space
// of perfect squares. The sample space consists of all perfect squares starting from 1 (i.e., 1, 4, 9, 16, 25, …)
// Input: n = 9;    Output: 2   1 and 4 are only perfect squares less than 9

// Problem: https://www.geeksforgeeks.org/problems/count-squares3649/1

class CountPerfectSquares {
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

