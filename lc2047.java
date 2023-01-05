// https://leetcode.com/problems/number-of-valid-words-in-a-sentence/
public class lc2047 {
    class Solution {
        public int countValidWords(String sentence) {
            String p1 = "^([a-z]+(-?[a-z]+)?)?(!|\\.|,)?$";
            String p2 = "[^0-9]+";
            String[] ns = sentence.split("\\s+");
            int ans = 0;
            for(String s: ns) {
                if(s.matches(p1) && s.matches(p2)) ans++;
            }
            return ans;
        }
    }
}
