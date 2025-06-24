class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Naive Solution using Bruteforce Approach
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0; i<nums.length; i++){
            if(i == 0){                     // if element is at the first index and single
                if(nums[i] != nums[i+1]){
                    return nums[i];
                }
            }
            else if(i == nums.length-1){    // if element is at the last index and single
                if(nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
            else{ // check if element at the current index matches to the prev index or next index
                if(nums[i] != nums[i+1] && nums[i] != nums[i-1]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
}