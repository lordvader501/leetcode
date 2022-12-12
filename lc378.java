// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/

import java.util.Arrays;
public class lc378 {
    class Solution {
        public int kthSmallest(int[][] matrix, int k) {
            int row = matrix.length;
            int col = matrix[0].length;
            int dim = col * row;
            int m = 0;
            int[] nmat = new int[dim];
            for (int i = 0; i < row ; i++) {
                for (int j = 0; j < col; j++ , m++) {
                    nmat[m] = matrix[i][j];
                }
            }
            Arrays.sort(nmat);
            return nmat[k-1];
        }
    }
}
