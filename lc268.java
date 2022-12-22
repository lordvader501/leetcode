// https://leetcode.com/problems/missing-number/
public class lc268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] < nums.length && nums[i] != nums[nums[i]]) swap(nums, i, nums[i]);
                else i++;
            }
            for (int in = 0; in < nums.length; in++) {
                if (nums[in] != in) return in;
            }
            return nums.length;
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
