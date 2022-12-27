// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class lc1342 {
    class Solution {
        public int numberOfSteps(int num) {
            return calc(num, 0);
        }
        public int calc(int num, int count) {
            if (num == 0) return count;
            if ((num & 1) == 1) return calc(--num, ++count);
            else return calc(num/2, ++count);
        }
    }
}
