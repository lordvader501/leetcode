// https://leetcode.com/problems/search-in-rotated-sorted-array
public class lc33 {
    public int search(int[] nums, int target) {
        int maxVal = findMaxIndex(nums);
        if (maxVal == -1) return bSearch(target, nums, 0, nums.length-1);
        if (nums[maxVal] == target) return maxVal;
        if (target >= nums[0]) return bSearch(target, nums, 0, maxVal-1);
        return bSearch(target, nums, maxVal+1, nums.length-1);
    }
    public int findMaxIndex(int[] nums) {
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
}
