// https://leetcode.com/problems/sqrtx/
public class lc69 {
    class Solution {
        public int mySqrt(int x) {
            if (x==1)
                return 1;
            long st = 0;
            long end = x/2;
            long sqrt = 0;
            while (st <=end) {
                long mid = st + (end-st)/2;
                if (mid*mid < x){
                    st = mid + 1;
                    sqrt = mid;
                }else if (mid*mid > x){
                    end = mid - 1;
                }else 
                    return (int)mid;
            }
            return (int)sqrt;
        }
    }
}