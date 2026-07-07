// HashMap - O(n) - find needed element - If needed in hashmap - return needed , else store curr
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];

            if(map.containsKey(needed)){
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{};
    }
}