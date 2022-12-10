// https://leetcode.com/problems/median-of-two-sorted-arrays/
import java.util.Arrays;
public class lc4 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len1 = nums1.length;
            int len2 = nums2.length;
            int mlen = len1 + len2;
            int[] mArr = mergeArr(nums1, nums2, len1, len2, mlen);
            if(mlen % 2 != 0) return (double) mArr[mlen/2];
            else return (double) (mArr[mlen/2 - 1] + mArr[mlen/2])/2;
        }
        public int[] mergeArr(int[] arr1, int[] arr2, int len1, int len2, int mlen){
            int[] newArr = new int[mlen];
            int j = len1;
            for (int i = 0; i < len1; i++)
                newArr[i] = arr1[i];
            for (int i = 0; i < len2; j++, i++)
                newArr[j] = arr2[i];
            Arrays.sort(newArr);
            return newArr;
        }
    }
}
