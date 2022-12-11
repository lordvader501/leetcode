// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/
public class lc154 {
    public int findMin(int[] nums) {
        int piviot = findPiviot(nums);
        if (piviot != -1) return nums[piviot+1];
        else return nums[0];
    }
    public int findPiviot(int[] nums) {
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
