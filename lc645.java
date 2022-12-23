// https://leetcode.com/problems/set-mismatch/
public class lc645 {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1);
                else i++;
            }
            for (i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) break;
            }
            return new int[]{nums[i], i + 1};
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
