// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        int i = S.length() - 1; // Start from the end of the string
        StringBuilder ans = new StringBuilder(); // This will store our final answer
        
        // STEP 1: Collect a full number (can be multiple digits like 20)
        while (i >= 0) {
            // Collect digits to form a number
            StringBuilder num = new StringBuilder();
            while (i >= 0 && Character.isDigit(S.charAt(i))) {
                num.insert(0, S.charAt(i)); // Add digit at the beginning to keep number in correct order
                i--; // Move to the previous character
            }
            ans.append(num); // Add the number to the answer

            // STEP 2: Add the operator (like +, -, *, /)
            if (i >= 0 && !Character.isDigit(S.charAt(i))) {
                ans.append(S.charAt(i)); // Add the operator to the answer
                i--;
            }
        }

        return ans.toString(); // Return the reversed equation
    }
}
