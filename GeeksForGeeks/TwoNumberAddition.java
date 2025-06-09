import java.util.Scanner;

// Given two numbers a and b. Your task is to return the sum of a and b
public class TwoNumberAddition {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.addition(10,20);
        System.out.println(result);
    }
}
// This is the GeeksForGeeks solution
class Solution {
    static int addition(int a, int b) {
        return a + b;
    }
}
