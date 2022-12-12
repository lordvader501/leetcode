// https://leetcode.com/problems/guess-number-higher-or-lower/
public class lc374 {
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start = 0;
            int end = n;
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (guess(mid) == 0) return mid;
                if (guess(mid) == 1) start = mid + 1;
                else end = mid - 1;
            }
            return start;
        }
    }
}
