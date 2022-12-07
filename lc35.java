// https://leetcode.com/problems/search-insert-position/
public class lc35 {
    class Solution {
        public int searchInsert(int[] nums, int target) {
            int st = 0;
            int end = nums.length - 1;
            while (st <= end){
                int mid = st + (end-st)/2;
                if (target < nums[mid]) end = mid - 1;
                else if (target > nums[mid]) st = mid + 1;
                else return mid;
            }
            return st;
        }
    }
}