// https://leetcode.com/problems/first-missing-positive/
public class lc41 {
    class Solution {
        public int firstMissingPositive(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1);
                else i++;
            }
            for (i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) return i+1;
            }
            return nums.length+1;
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
