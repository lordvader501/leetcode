// https://leetcode.com/problems/multiply-strings/
public class lc43 {
    class Solution {
        public String multiply(String num1, String num2) {
            if (num1.length() == 0 || num2.length() == 0 || "0".equals(num1) || "0".equals(num2)) return "0";
            if ("1".equals(num1)) return num2;
            if ("1".equals(num2)) return num1;
            int ptr1 = num1.length() - 1, ptr2 = num2.length() - 1;
            int[] mans = new int[ptr1 + ptr2 + 2];
            StringBuilder ns = new StringBuilder();
            for (ptr1 = num1.length() - 1; ptr1 >= 0; ptr1--) {
                for (ptr2 = num2.length() - 1; ptr2 >=0; ptr2--) {
                    int temp= (num1.charAt(ptr1) - '0') * (num2.charAt(ptr2) - '0');
                    temp += mans[ptr1 + ptr2 + 1];
                    mans[ptr1 + ptr2 + 1] = temp%10;
                    mans[ptr1 + ptr2] += temp/10; 
                }
            }
            for (int ans : mans) ns.append(ans);
            if (ns.charAt(0) == '0') ns.deleteCharAt(0);
            return ns.toString();
        }
    }
}
