class Solution {
public:
    int majorityElement(vector<int>& nums) { // Moore Voting Algorithm
        int t = 0, c = 0;
        for (int num : nums){
            if(c == 0) t = num;
            c = num == t ? c + 1 : c - 1;
        }
        return t;
    }
};
