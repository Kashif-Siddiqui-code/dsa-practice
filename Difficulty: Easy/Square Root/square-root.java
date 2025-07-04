class Solution {
    int floorSqrt(int n) {
    int start = 0;
    int end = n;

    while (start <= end) {
        int mid = start + (end - start) / 2;
        long val = (long) mid * mid; // Prevent overflow

        if (val <= n) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return end;
        
    }
}