// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr.get(start) <= arr.get(mid)){
                if(arr.get(start) < ans){
                  index = start;
                  ans = arr.get(start);
                }
                
                start = mid + 1;
            }
            else{
                end = mid - 1;
                if(arr.get(mid) < ans){
                    index = mid;
                    ans = arr.get(mid);
                }
                
                
            }
          
        }
        return index;
        
    }
}