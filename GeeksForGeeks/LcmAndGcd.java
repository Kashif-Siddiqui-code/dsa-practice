// Given two integers a and b, the task is to compute their LCM and GCD and return an array containing
// their LCM and GCD
// Problem: https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1

public class LcmAndGcd {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int a = 12;
        int b = 18;
        int[] result = sol.lcmAndGcd(a, b);
        System.out.println("LCM: " + result[0]);
        System.out.println("GCD: " + result[1]);
    }
}

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // calculate gcd
        int gcd = findGCD(a, b);
        // calculate lcm
        int lcm = (a*b)/gcd;
        // return lcm and hcf as an array
        return new int[] {lcm, gcd};
    }
    // helper method to find GCD
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
