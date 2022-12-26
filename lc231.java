// https://leetcode.com/problems/power-of-two/
public class lc231 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            while (n != 1) {
                if (!((n | 1) > n)) return false;
                n /= 2;
            }
            return true;
        }
    }
}
