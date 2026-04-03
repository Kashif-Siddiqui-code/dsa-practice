class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through each element
        for (int i = 0; i < nums.length; i++) {
            
            // Compare it with every other element
            for (int j = i + 1; j < nums.length; j++) {
                
                // Check if the sum equals target
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        
        return new int[] {};
 
    }
}