// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class lc1351 {
    class Solution {
        public int countNegatives(int[][] grid) {
            int ans = 0;
            for (int[] arr : grid) {
                ans += findNegIndex(arr);
            }
            return ans;
        }
        public int findNegIndex(int[] arr) {
            if (arr[0] < 0) return arr.length;
            if (arr[arr.length-1] >= 0) return 0;
            int start = 0;
            int end = arr.length - 1;
            int index = 0;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (arr[mid] < 0) {
                    index = mid;
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
            return arr.length - index;
        }
    }
}