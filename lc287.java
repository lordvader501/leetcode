// https://leetcode.com/problems/find-the-duplicate-number/
public class lc287 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1);
                else i++;
            }
            for (i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) break;
            }
            return nums[i];
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
