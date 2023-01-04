// https://leetcode.com/problems/reverse-words-in-a-string/
public class lc151 {
    class Solution {
        public static String reverseWords(String s) {
            s = s.trim();
            s = s.replaceAll("\\s+", " ");
            int ptr1 = s.length() - 1;
            int ptr2 = s.length() - 1;
            int temp;
            StringBuilder ns = new StringBuilder();
            boolean check = true;
            while (ptr1 >= 0) {
                while ((s.charAt(ptr1) != ' ') && (check)) {
                    ptr1--;
                    if ((ptr1<0)) {
                        ptr1 = 0;
                        check = false;
                    }
                }
                temp = ptr1;
                if (s.charAt(ptr1) == ' ') ptr1++;
                while (ptr1 <= ptr2) {
                    ns.append(s.charAt(ptr1) + "");
                    ptr1++;
                }
                if (temp != 0) ns.append(" ");
                ptr1 = temp - 1;
                ptr2 = ptr1;
            }
            return ns.toString();
        }
    }
}
