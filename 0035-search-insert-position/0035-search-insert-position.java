class Solution {
    public int searchInsert(int[] nums, int target) {
        // we can solve this problem using the code to find the lower bound
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(nums[mid] >= target){
                ans = mid;  // possible answer
                end = mid - 1;  // search on left side
            }
            else{
                start = mid + 1;  // search on right side
            }
            
        }
        return ans;
    }
}