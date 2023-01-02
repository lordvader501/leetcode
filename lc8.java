// https://leetcode.com/problems/string-to-integer-atoi/
public class lc8 {
    class Solution {
        public int myAtoi(String s) {
            s = s.trim();
            if (s.length() == 0) return 0;
            int index = 0;
            long ns = 0;
            int sign = 1;
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;
            if (s.charAt(index) == '-' || s.charAt(index) == '+') {
                sign = s.charAt(index) == '+' ? 1 : -1;
                index++;
            }
            while (index < s.length() && ((s.charAt(index) - '0') >= 0 && (s.charAt(index) - '0') <= 9)) {
                ns =  ns * 10 + (s.charAt(index) - '0');
                if (sign == 1 && ns >= max) return max;
                if (-ns <= min) return min;
                index++;
            }
            return sign * (int)ns;
        }
    }
}
