// https://leetcode.com/problems/valid-number/
public class lc65 {
    class Solution {
        public boolean isNumber(String s) {
            int ptr = 0, n = s.length();
            if (ptr < n && (s.charAt(ptr) == '+' || s.charAt(ptr) == '-')) ptr++;
            boolean flag = false;
            while (ptr < n && Character.isDigit(s.charAt(ptr))) {
                ptr++;
                flag = true;
            }
            if (ptr < n && s.charAt(ptr) == '.') {
                ptr++;
                while (ptr < n && Character.isDigit(s.charAt(ptr))) {
                    ptr++;
                    flag = true;
                }
            }
            if (flag && ptr < n && (s.charAt(ptr) == 'e' || s.charAt(ptr) == 'E')) {
                ptr++;
                flag = false;
                if (ptr < n && (s.charAt(ptr) == '+' || s.charAt(ptr) == '-')) ptr++;
                while (ptr < n && Character.isDigit(s.charAt(ptr))) {
                    ptr++;
                    flag = true;
                }
            }
            return flag && ptr == n;
        }
    }
}