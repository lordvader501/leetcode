// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class lc1608 {
    class Solution {
        public int specialArray(int[] nums) {
            int start = 0;
            int end = nums.length;
            while(start <= end){
                int mid = start + (end -  start)/2;
                int count = count(nums, mid);
                if(count == mid) return mid;
                else if(count > mid) start = mid + 1;
                else end = mid -1;
            }
            return -1;
        }
        public int count(int arr[], int x){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] >= x) count++;
            }
            return count;
        }
    }
}
