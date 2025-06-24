class Solution {
    public int singleNonDuplicate(int[] nums) {
        // Binray Search
        int n = nums.length;
        if(n == 1){ // if array has single element return first element
            return nums[0];
        }
        if(nums[0] != nums[1]){ // if first element is single
            return nums[0];
        }
        if(nums[n-1] != nums[n-2]){  // if last element is single
            return nums[n-1];
        }
        int start = 1;
        int end = nums.length-2;

        while(start <= end){
            int mid = start + (end - start)/2;
            // the element is single if the prev and next element are not equal to current element
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            // we are in left half 
            if((mid%2 == 1 && nums[mid] == nums[mid-1]) || (mid%2 == 0 && nums[mid] == nums[mid+1])){
                start = mid + 1;
            }
            // we are on right half
            else{
                end = mid - 1;
            }
        }

        return -1;
    }
}