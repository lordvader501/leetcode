// https://leetcode.com/problems/find-right-interval/
public class lc436 {
    class Solution {
        public int[] findRightInterval(int[][] inter) {
            int[] ret = new int[inter.length];
            boolean isAsc = (inter[0][0] <= inter[inter.length-1][0]);
            for (int i = 0; i < inter.length; i++) {
                int start = 0;
                int end = inter.length - 1;
                ret[i] = -1;
                while (start <= end) {
                    int mid = start + (end - start)/2;
                    if (isAsc) {
                        if (((mid > i) && (inter[mid][0] >= inter[i][1]) && (inter[mid-1][0] < inter[i][1])) || ((inter[mid][0] >= inter[i][1]) && (mid == 0))){
                            ret[i] = mid;
                            break;
                        }
                        else if (inter[mid][0] >= inter[i][1]) end = mid - 1;   
                        else start = mid + 1;
                    }else {
                        if (((mid < inter.length) && (inter[mid][0] >= inter[i][1]) && (inter[mid+1][0] < inter[i][1])) || ((inter[mid][0] >= inter[i][1]) && (mid == inter.length-1)))  {
                            ret[i] = mid;
                            break;
                        }
                        else if (inter[mid][0] >= inter[i][1]) start = mid + 1;   
                        else end = mid - 1;
                    }
                }
            }
            return ret;
        }
    }
}
