// https://leetcode.com/problems/single-number/
public class lc136 {
    class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums){
            res = res ^ i;
        }
        return res;
    }
}
}