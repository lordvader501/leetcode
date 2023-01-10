// https://leetcode.com/problems/maximum-product-of-word-lengths/
import java.util.Arrays;
public class lc318 {
    class Solution {
        public int maxProduct(String[] words) {
            Arrays.sort(words,(a,b)->b.length()-a.length());
            int ptr1 = 0, ptr2;
            int maxProd = 0;
            int prod;
            while (ptr1 < words.length - 1) {
                if (words[ptr1].length() * words[ptr1].length() <= maxProd) break;
                for (int i = 1; i < words.length - 1; i++) {
                    ptr2 = i + 1;
                    boolean check = hasComm(words[ptr1], words[ptr2]);
                    if (!check) {
                        prod = words[ptr1].length() * words[ptr2].length();
                        if (prod > maxProd) {
                            maxProd = prod;
                        }
                    }
                }
                ptr1++;
            }
            return maxProd;
        }
        public boolean hasComm(String a, String b) {
            boolean[] inA = new boolean[26];
            for(int i = 0; i < a.length(); i++){
                inA[a.charAt(i) - 'a'] = true;
            }
            for(int i = 0; i < b.length(); i++){
                if(inA[b.charAt(i) - 'a']) return true;
            }
            return false;
        }
    }
}