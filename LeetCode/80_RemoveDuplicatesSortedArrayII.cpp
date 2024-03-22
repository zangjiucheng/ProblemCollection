class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int c = 1, index = 1, old = nums[0];
        int t;
        if (nums.size() == 1){
            return 1;
        }
        for (int i = 1; i < nums.size(); i++ ){
            t = nums[i];
            if (t == old){
                if (c < 2){
                    c++;
                    nums[index++] = t;
                }
            } else {
                old = t;
                c = 1;
                nums[index++] = t;
            }
        }
        return index;
    }
};
