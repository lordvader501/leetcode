// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;
public class lc448 {
    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] != nums[nums[i]-1]) swap(nums, i, nums[i]-1);
                else i++;
            }
            ArrayList<Integer> ans = new ArrayList<>();
            for (int in = 0; in < nums.length; in++) {
                if (nums[in] != in + 1) ans.add(in+1);
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
