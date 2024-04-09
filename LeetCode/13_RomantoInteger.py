class Solution:
    def romanToInt(self, s: str) -> int:
        m = {
            'I': 1,
            'V': 5,
            'X': 10,
            'L': 50,
            'C': 100,
            'D': 500,
            'M': 1000
        }

        result = 0
        length = len(s)

        for i in range(length):
            if i < length - 1 and m[s[i]] < m[s[i+1]]:
                result -= m[s[i]]
            else:
                result += m[s[i]]

        return result
