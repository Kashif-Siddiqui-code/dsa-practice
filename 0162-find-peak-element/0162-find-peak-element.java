class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0, end = nums.length - 1, mid;

        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                // If mid is greater than the next element, move left
                end = mid;
            } else {
                // If mid is less than or equal to the next element, move right
                start = mid + 1;
            }
        }
        // At the end of the loop, start == end, which points to a peak
        return start;
    }
}