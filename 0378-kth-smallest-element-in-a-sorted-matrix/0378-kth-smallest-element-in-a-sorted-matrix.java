class Solution {
    public int kthSmallest(int[][] matrix, int k) {
               int n = matrix.length;
        int low = matrix[0][0]; // smallest
        int high = matrix[n - 1][n - 1]; // largest

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid, n);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Helper: count how many numbers ≤ mid
    private int countLessEqual(int[][] matrix, int mid, int n) {
        int count = 0;
        int row = n - 1; // start from bottom-left
        int col = 0;

        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                count += (row + 1); // all elements above are <= mid
                col++;
            } else {
                row--;
            }
        }

        return count; 
    }
}