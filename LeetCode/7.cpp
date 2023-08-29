#include <iostream>
#include <cmath>

using namespace std;

class Solution
{
public:
    int reverse(int x)
    {
        int MIN = (int)(-pow(2, 31) / 10);
        int MAX = (int)((pow(2, 31) - 1) / 10);
        int temp = 0;
        while (abs(x) > 0)
        {
            if (MIN > temp || temp > MAX)
                return 0;
            (temp *= 10) += (x % 10);
            x /= 10;
        }
        return temp;
    }
};

int main()
{
    Solution s;
    cout << s.reverse(1534236469);
}