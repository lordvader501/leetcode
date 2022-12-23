// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class lc442 {
    class Solution {
        public List<Integer> findDuplicates(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1);
                else i++;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (i = 0; i < nums.length; i++) {
                if (nums[i] != i + 1) ans.add(nums[i]);
            }
            return ans;
        }
        public void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
