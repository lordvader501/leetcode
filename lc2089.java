// https://leetcode.com/problems/find-target-indices-after-sorting-array/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class lc2089 {
    class Solution {
        public List<Integer> targetIndices(int[] nums, int target) {
            Arrays.sort(nums);
            ArrayList<Integer> ans = new ArrayList<>();
            int start = 0;
            int end = nums.length - 1;
            int fi = 0;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (target == nums[mid]) { 
                    if (mid > 0) {
                        if (target != nums[mid-1]) {
                            fi = mid;
                            break;
                        }else end = mid - 1;
                    }else break;
                }
                else if (target < nums[mid]) end = mid - 1;
                else start = mid + 1;
            }
            while (fi < nums.length && nums[fi] == target) {
                ans.add(fi);
                fi++;
            }
            return ans;
        }
    }
}
