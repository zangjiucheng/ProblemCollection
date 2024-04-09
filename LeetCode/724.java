class Solution {
    public int pivotIndex(int[] nums) {
        for (int x = 0; x < nums.length; x++) {
            int left = 0;
            int right = 0;
            for (int i = 0; i < x; i++) {
                left += nums[i];
            }
            for (int j = 1; j < nums.length - x; j++) {
                right += nums[nums.length - j];
            }
            if (left == right) {
                return x;
            }
        }
        return -1;
    }
}