// https://leetcode.com/problems/valid-palindrome/
public class lc125 {
    public class Solution {
        public boolean isPalindrome(String s) {
            s = s.toLowerCase();
            int l = 0;
            int r = s.length() - 1;
            while(l <= r) {
                char leftChar = s.charAt(l);
                char rightChar = s.charAt(r);
                if (!Character.isLetterOrDigit(leftChar)) l++;
                else if(!Character.isLetterOrDigit(rightChar)) r--;
                else {
                    if(leftChar != rightChar) return false;
                    l++;
                    r--;
                }
            }
            return true;
        }
    }
}
