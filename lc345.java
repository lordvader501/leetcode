// https://leetcode.com/problems/reverse-vowels-of-a-string/
public class lc345 {
    class Solution {
        public String reverseVowels(String s) {
             int left = 0;
            int right = s.length() - 1;
            char temp;
            char[] chars = s.toCharArray();
            while (left < right) {
                if (isVowel(chars[left]) && isVowel(chars[right])) {
                    temp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = temp;
                    right--;
                    left++;
                }
                if (!isVowel(chars[left])) left++;
                if (!isVowel(chars[right])) right--;
            }
            StringBuilder ns  =new StringBuilder();
            for (char ch : chars) ns.append(ch);
            return ns.toString();
        }
        public boolean isVowel(char ch) {
            if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'I' || ch == 'E' || ch == 'O' || ch == 'U') return true;
            return false;
        }
    }
}
