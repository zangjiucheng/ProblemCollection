#include <iostream>
#include <string>
using namespace std;

class Solution
{
public:
    string longestPalindrome(string s)
    {
        string pieceS;
        for (int i = s.size(); i > 1; i--)
        {
            for (int j = 0; (s.size() - i - j + 1) > 0; j++)
            {
                pieceS = s.substr(j, i);
                if (palindromicCheck(pieceS, i))
                {
                    return pieceS;
                }
            }
        }
        return s.substr(0, 1);
    }

    bool palindromicCheck(string s, int size)
    {
        char *stringListStart = new char[s.length() + 1];
        strcpy(stringListStart, s.c_str());
        char *stringListEnd = stringListStart + size - 1;
        for (int i = 0; i < (s.size() / 2) + 1; i++)
        {
            if (*(stringListStart + i) != *(stringListEnd - i))
            {
                delete[] stringListStart;
                return false;
            }
        }
        delete[] stringListStart;
        return true;
    }
};