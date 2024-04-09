class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < i + 1; j++) {
                temp += nums[j];
            }
            result[i] = temp;
        }
        return result;
    }
}