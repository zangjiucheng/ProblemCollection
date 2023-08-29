#include <iostream>
#include <string>
/*
https://youtu.be/V-sEwsca1ak
*/

using namespace std;

class Solution
{
public:
    string longestPalindrome(string s)
    {
        int Length = s.length();
        if (Length == 1)
        {
            return s;
        }
        // else if (Length == 2 && (s[0] == s[1]))
        // {
        //     return s;
        // }

        int strLen = 2 * Length + 3;
        char *sChars = new char[strLen];

        sChars[0] = '@';
        sChars[strLen - 1] = '$';
        int t = 1;

        for (char c : s)
        {
            sChars[t++] = '#';
            sChars[t++] = c;
        }
        cout << sChars << endl;

        int maxLen = 0;
        int start = 0;
        int maxRight = 0;
        int center = 0;
        int *p = new int[strLen];

        // Initial Point (Only Leetcode)
        int *k = p;
        for (int i = 0; i < strLen; i++)
        {
            *k = 0;
            k++;
        }

        for (int i = 1; i < strLen - 1; i++)
        {
            if (i < maxRight)
            {
                p[i] = min(maxRight - i, p[2 * center - i]);
            }

            // Expanding along the center
            while (sChars[i + p[i] + 1] == sChars[i - p[i] - 1])
            {
                p[i]++;
            }

            // Updating center and its bound
            if (i + p[i] > maxRight)
            {
                center = i;
                maxRight = i + p[i];
            }

            // Updating ans
            if (p[i] > maxLen)
            {
                start = (i - p[i] - 1) / 2;
                maxLen = p[i];
            }
        }
        cout << p << endl;
        delete[] sChars;
        delete[] p;
        return s.substr(start, maxLen);
    }
};

int main()
{
    Solution solution;
    string s = "";
    string out = solution.longestPalindrome("bbb");
    cout << endl
         << out << endl;
    return 0;
}