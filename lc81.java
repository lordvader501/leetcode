// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class lc81 {
    class Solution {
        public boolean search(int[] nums, int target) {
            int piviot = findMaxIndex(nums);
            if (piviot == -1) {
                if (bSearch(target, nums, 0, nums.length-1) != -1) return true;
                return false;
            }
            if (nums[piviot] == target) {
                return true;
            }
            if (target >= nums[0]){
                if (bSearch(target, nums, 0, piviot-1) != -1) return true;
                return false;
            }
            else {
                if (bSearch(target, nums, piviot+1, nums.length-1) != -1) return true;
                return false;
            }
        }
        public int bSearch(int target, int[] nums, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (target > nums[mid]) {
                    start = mid + 1;
                }
                else if (target < nums[mid]) {
                    end = mid - 1;
                }
                else return mid;
            }
            return -1;
        }
        public int findMaxIndex(int[] nums) {
            int start = 0;
            int end = nums.length - 1;
            while(start <= end){
                int mid = start + (end - start)/2;
                if (mid < end && nums[mid] > nums[mid+1]) return mid;
                if (start < mid && nums[mid] < nums[mid-1]) return mid-1;
                if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                    if (start < end && nums[start] > nums[start+1]) return start;
                    start++;
                    if (end > start && nums[end] < nums[end-1]) return end - 1;
                    end--;
                }
                else if(nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])) start = mid + 1;
                else end = mid - 1;
            }
            return -1;
        }
    
    }
}
