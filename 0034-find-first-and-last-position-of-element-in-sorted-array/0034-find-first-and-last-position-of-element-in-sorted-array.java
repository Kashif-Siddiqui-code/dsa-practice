class Solution {
    // function to find first occurence of x
    static int findFirst(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target == nums[mid]){
                res = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return res;
    }

    // function to find the last occurence of x
    static int findLast(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target == nums[mid]){
                res = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
        
    }

    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        
        return new int[]{first, last}; 
        
    }
}