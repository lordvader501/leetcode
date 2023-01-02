// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class lc28 {
    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() > haystack.length()) return -1;
            return findI(haystack, needle, 0);
    
        }
        public int findI(String substr, String find, int n) {
            if (substr.isEmpty() || (substr.length() < find.length())) {
                return -1;
            }
            if (substr.startsWith(find)) return n;
            return findI(substr.substring(1), find, ++n);
        }
    }
}
