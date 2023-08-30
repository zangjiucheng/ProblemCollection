#include <iostream>

using namespace std;

class Solution
{
public:
    int maxArea(vector<int> &height)
    {
        int result, max_val, LEFT, WIDTH, volume;
        result = LEFT = max_val = 0;
        int RIGHT = height.size() - 1;
        while (LEFT < RIGHT)
        {
            WIDTH = RIGHT - LEFT;
            if (height[RIGHT] < height[LEFT])
            {
                volume = WIDTH * min(height[RIGHT], height[LEFT]);
                max_val = (volume < max_val) ? max_val : volume;
                RIGHT--;
            }
            else
            {
                volume = WIDTH * min(height[RIGHT], height[LEFT]);
                max_val = (volume < max_val) ? max_val : volume;
                LEFT++;
            }
        }
        return max_val;
    }
};

int main()
{
    Solution s;
    vector<int> Height = {1, 1};
    cout << s.maxArea(Height) << endl;
    return 0;
}