// User function Template for Java

class GFG {
    // function to find first occurence of x
    
    static int findFirst(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(x == arr[mid]){
                res = mid;
                end = mid - 1;
            }
            else if(x < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        
        return res;
    }
    
    // function to find the last occurence of x
    static int findLast(int[] arr, int x){
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(x == arr[mid]){
                res = mid;
                start = mid + 1;
            }
            else if(x < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return res;
        
    }
 // Function for finding first and last occurrence of x
 
    ArrayList<Integer> find(int arr[], int x) {
    
         int first = findFirst(arr, x);
         int last = findLast(arr, x);
         
         ArrayList<Integer> res = new ArrayList<>();
         res.add(first);
         res.add(last);
         return res;
        
    }
}
