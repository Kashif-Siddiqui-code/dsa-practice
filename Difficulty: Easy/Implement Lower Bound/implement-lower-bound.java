class Solution {
    int lowerBound(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int ans = arr.length;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] >= target){
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
