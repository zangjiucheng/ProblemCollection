import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] both = concat(nums1, nums2);
        Arrays.sort(both);
        int meanDigit = (int) (both.length / 2);
        if (both.length % 2 == 1) {
            return both[meanDigit];
        }
        return (both[meanDigit] + both[meanDigit - 1]) / 2.0;
    }

    static int[] concat(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
}