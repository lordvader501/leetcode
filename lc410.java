// https://leetcode.com/problems/split-array-largest-sum/
public class lc410 {
    class Solution {
        public int splitArray(int[] nums, int k) {
            int start = 0;
            int end = 0;
            for (int i = 0; i < nums.length; i++) {
                if (start < nums[i]) start = nums[i];
                end += nums[i];
            }
            while (start < end){
                int mid = start + (end - start)/2;
                int sum = 0;
                int nos = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        sum = num;
                        nos++;
                    }else sum +=num;
                }
                if (nos > k) start = mid + 1;
                else end = mid;
            }
            return end;
        }
    }    
}
