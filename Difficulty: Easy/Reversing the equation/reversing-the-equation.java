// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        int i = S.length() - 1;
        StringBuilder ans = new StringBuilder();

        while (i >= 0) {
            // Collect digits to form a number
            StringBuilder num = new StringBuilder();
            while (i >= 0 && Character.isDigit(S.charAt(i))) {
                num.insert(0, S.charAt(i)); // Prepend digit to maintain number order
                i--;
            }
            ans.append(num);

            // Append operator if any
            if (i >= 0 && !Character.isDigit(S.charAt(i))) {
                ans.append(S.charAt(i));
                i--;
            }
        }

        return ans.toString();
    }
}