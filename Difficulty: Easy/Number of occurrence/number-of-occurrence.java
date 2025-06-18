class Solution {
    
    // function to find the first occurrence of target element
    public static int findFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target == arr[mid]){
                res = mid;
                end = mid - 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
        
    }
    
    // function to find the last occurrence of target element
    public static int findLast(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(target == arr[mid]){
                res = mid;
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
    }
    
    int countFreq(int[] arr, int target) {
        
        int first = findFirst(arr, target);
        
        if(first == -1) return 0;  // If first == -1, it means the element doesn't exist.
        
        int last = findLast(arr, target);
        
        return (last - first) + 1; // get the count of occurrence
        
    }
}
