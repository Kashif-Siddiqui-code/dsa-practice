class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1; // start from top-right

        while (row < rows && col >= 0) {
            int value = matrix[row][col];

            if (value == target) {
                return true;
            } else if (value > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return false;
    }
}