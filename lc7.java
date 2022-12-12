// https://leetcode.com/problems/reverse-integer/
public class lc7 {
    class Solution {
        public int reverse(int x) {
            int rev = 0;
            while (x != 0){
                if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && x > 7)) return 0;
                if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && x < -8)) return 0;
                rev = rev*10 + x%10;
                x = x/10;
            }
            return rev;
        }
    }
}
