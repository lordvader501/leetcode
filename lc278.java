// https://leetcode.com/problems/first-bad-version
public class lc278 {
    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 1;
            int end = n;
            int fbv = -1;
            while(start <= end){
                int mid = start +  (end - start )/2;
                if(isBadVersion(mid)){
                    fbv = mid;
                    end = mid -1;
                }
                else start = mid+1;
            }
            return fbv;
        }
    }
}
