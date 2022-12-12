// https://leetcode.com/problems/search-a-2d-matrix-ii/
public class lc240 {
    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            int r = 0;
            int c = matrix[0].length - 1;
            while (r < matrix.length && c>=0) {
                if (target == matrix[r][c]) return true;
                if(target < matrix[r][c]) c--;
                else r++; 
            }
            return false;
        }
    }
}