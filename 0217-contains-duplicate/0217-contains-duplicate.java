class Solution {
    // The bruteforce approach gives Time Complexity O(n*2)
    // Solve it using Hashset Data Structure in O(n) TC

    public boolean containsDuplicate(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int num : nums){
        if(set.contains(num)){
            return true;
        }
        set.add(num);
       }
       return false;
    }
}