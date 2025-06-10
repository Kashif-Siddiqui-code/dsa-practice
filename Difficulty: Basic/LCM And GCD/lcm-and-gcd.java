
// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        
        // calculate gcd
        int gcd = findGCD(a, b);
        
        // calculate lcm
        int lcm = (a*b)/gcd;
        
        // return lcm and hcf as an array
        return new int[] {lcm, gcd}; 
        
    }
    
    // helper method to calcualte gcd
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}