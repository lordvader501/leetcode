// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class lc153 {
    class Solution {
        public int findMin(int[] nums) {
            int piviot = findPiviot(nums);
            if (piviot != -1) return nums[piviot+1];
            else return nums[0];
        }
        public int findPiviot(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while(start < end){
                int mid = start + (end - start)/2;
                if (mid < end && nums[mid] > nums[mid+1]) return mid;
                if (start < mid && nums[mid] < nums[mid-1]) return mid-1;
                if (nums[mid] <= nums[start]) end = mid - 1;
                else start = mid + 1;
            }
            return -1;
        }
    }
}
