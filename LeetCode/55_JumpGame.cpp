class Solution {
public:
    bool canJump(vector<int>& nums) {
        int maxIdx = nums[0];
        int size = nums.size();

        for(int i = 0; i < size; i++){
            if (maxIdx >= size - 1) return true;
            if (nums[i] == 0 && maxIdx == i) return false;
            if (i + nums[i] > maxIdx) maxIdx = i + nums[i];
        }

        return true;
    }
};
