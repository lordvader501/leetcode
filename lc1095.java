// https://leetcode.com/problems/find-in-mountain-array/
public class lc1095 {
    class Solution {
        public int findInMountainArray(int target, MountainArray mountainArr) {
            int maxVal = findMaxIndex(mountainArr);
            int leftAns = bSearch(target, mountainArr, 0, maxVal, true);
            if (leftAns != -1) return leftAns;
            else return bSearch(target, mountainArr, maxVal, mountainArr.length()-1, false);
        }
        public int findMaxIndex(MountainArray mountainArr) {
            int start = 0;
            int end = mountainArr.length() - 1;
            while(start < end){
                int mid = start + (end - start)/2;
                if (mountainArr.get(mid) < mountainArr.get(mid+1)) start = mid + 1;
                else end = mid;
            }
            return start;
        }
        public int bSearch(int target, MountainArray mountainArr, int start, int end, boolean leftS) {
            while (start <= end) {
                int mid = start + (end - start)/2;
                if (target < mountainArr.get(mid)) {
                    if (leftS) end = mid - 1;
                    else start = mid + 1;
                }
                else if (target > mountainArr.get(mid)) {
                    if (leftS) start = mid + 1;
                    else end = mid - 1;
                }
                else return mid;
            }
            return -1;
        }
    }
}