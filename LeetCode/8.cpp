#include <iostream>

using namespace std;

class Solution
{
public:
    int myAtoi(string s)
    {
        int result = 0;
        int sign = 1;
        const char *sChr = s.c_str();

        while (*sChr == ' ')
        {
            sChr++;
        }

        if (*sChr == '-')
        {
            sign = -1;
            sChr++;
        }
        else if (*sChr == '+')
        {
            sChr++;
        }

        while (*sChr >= '0' && *sChr <= '9')
        {
            if (result > INT_MAX / 10 || (result == INT_MAX / 10 && *sChr - '0' > 7))
            {
                return sign == -1 ? INT_MIN : INT_MAX;
            }

            result = result * 10 + (*sChr - '0');
            sChr++;
        }

        return result * sign;
    }
};

int main()
{
    Solution s;
    cout << s.myAtoi("-123Hel1l2o3") << endl;
    return 0;
}