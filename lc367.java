// https://leetcode.com/problems/valid-perfect-square/
public class lc367 {
    class Solution {
        public boolean isPerfectSquare(int x) {
            if (x==1)
                return true;
            long st = 0;
            long end = x/2;
            while (st <=end) {
                long mid = st + (end-st)/2;
                if (mid*mid < x){
                    st = mid + 1;
                }else if (mid*mid > x){
                    end = mid - 1;
                }else {
                    return true;
                }
            }
            return false;    
        }
    }
}