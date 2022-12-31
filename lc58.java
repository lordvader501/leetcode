// https://leetcode.com/problems/length-of-last-word/
public class lc58 {
    class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int endIndex = s.length() - 1;
            int count = 0;
            while (endIndex != -1 && s.charAt(endIndex) != ' ') {
                count++;
                endIndex--;
            }
            return count;
        }
    }
}
