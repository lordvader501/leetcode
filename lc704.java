// https://leetcode.com/problems/binary-search/
public class lc704 {
    class Solution {
        public int search(int[] nums, int target) {
            int st = 0;
            int end = nums.length - 1;
            while(st<=end){
                int mid = st + (end-st)/2;
                if(target<nums[mid]) end = mid - 1;
                else if (target > nums[mid]) st = mid + 1;
                else return mid;
            }
            return -1;
        }
    }
}
// class Solution {
//     public int search(int[] nums, int target) {
//         int ans = Arrays.binarySearch(nums, target);
//         if (ans < 0) ans = -1;
//         return ans;
//     }
// }