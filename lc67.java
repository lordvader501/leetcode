// https://leetcode.com/problems/add-binary/
public class lc67 {
    class Solution {
        public String addBinary(String a, String b) {
            if (a.length() < b.length()) return addBinary(b, a);
            int idxa = a.length() - 1;
            int idxb = b.length() - 1;
            int carry = 0;
            int cha = 0;
            int chb = 0;
            StringBuilder ns = new StringBuilder();
            while (idxa >= 0) {
                cha = a.charAt(idxa) - '0';
                if (idxb < 0) chb = 0;
                else  chb = b.charAt(idxb) - '0';
    
                if (((cha) ^ (chb)) == 0 && cha == 0) {
                    if (carry == 0) ns.append(0);
                    else {
                        ns.append(1);
                        carry--;
                    }
                }
                else if (((cha) ^ (chb)) == 1) {
                    if (carry == 0) ns.append(1);
                    else {
                        ns.append(0);
                    }
                }
                else if (((cha) ^ (chb)) == 0 && cha == 1){
                    if (carry == 0) {
                        ns.append(0);
                        carry++;
                    }
                    else {
                        ns.append(1);
                    }
                }
                idxa--;
                idxb--;
            }
            if (carry == 1) ns.append(1);
            return ns.reverse().toString();
        }
    }
}
