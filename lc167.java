// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class lc167 {
    class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = bSearch(numbers, target);
            while (left < right) {
                if (numbers[left] + numbers[right] == target) break;
                if (numbers[left] + numbers[right] < target) ++left;
                if (numbers[left] + numbers[right] > target) --right;
            }
            return new int[]{++left , ++right};
        }
        public int bSearch(int[] nums, int target) {
            int s = 0;
            int e = nums.length - 1;
            while (s < e) {
                int m = s + (e-s)/2;
                if (target < nums[m]) e = m;
                else s = m + 1;
            }
            if (s == e && s < nums.length-1) return e+1;
            return e;
        }
    }
}
