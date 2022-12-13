// https://leetcode.com/problems/arranging-coins/
public class lc441 {
    class Solution {
        public int arrangeCoins(int n) {
            return calCol(n);
        }
        public int calCol(int n) {
            if (n == 1 || n == 2) return 1;
            long start = 3;
            long end = n/2;
            while (start <= end) {
                long mid = start + (end - start)/2;
                long mrow = mid * (mid + 1)/2;
                if (mrow == n) return (int)mid;
                if (mrow > n) end = mid - 1;
                else start = mid + 1;
            }
            return (int)start - 1;
        }
    }    
}
