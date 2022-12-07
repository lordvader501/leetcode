// https://leetcode.com/problems/two-sum/
public class lc1{
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] arr = new int[2];
            int i,j =0;
            for(i=0; i < nums.length; i++){
                for (j = 0; j!=i && j < nums.length; j++){
                    if (nums[i]+nums[j]==target){
                        arr[0]=j;
                        arr[1]=i;
                    }
                }
            }
            return arr;
        }
    }
}