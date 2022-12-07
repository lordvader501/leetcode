// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class lc34 {
    class Solution {
        public int[] searchRange(int[] nums, int t) {
            int[] ans = {-1, -1};
            ans[0] = search(nums, t, true);
            if (ans[0] != -1) ans[1] = search(nums, t, false);
            return ans;
        }
        int search(int[] nums, int t, boolean findSindex){
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if (t < nums[mid]) end = mid - 1;
                else if (t > nums[mid]) start = mid + 1;
                else{
                    ans = mid;
                    if (findSindex) end = mid - 1;
                    else start = mid + 1;
                }
            }
            return ans;
        }       
    }   
}
