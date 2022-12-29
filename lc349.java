// https://leetcode.com/problems/intersection-of-two-arrays/
import java.util.Arrays;
import java.util.HashSet;
public class lc349 {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0;
            int j = 0;
            HashSet<Integer> set = new HashSet<>();
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                    i++;
                    j++;
                }
                else if (nums1[i] < nums2[j]) i++;
                else j++;
            }
            int[] ans = new int[set.size()];
            int k = 0;
            for (int num : set) {
                ans[k++] = num;
            }
            return ans;
        }
    }
}
