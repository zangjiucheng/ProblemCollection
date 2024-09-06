def reverseWords(s: str) -> str:
    words = ""
    for i in s.split()[::-1]:
        words += i + " "
    return words[:-1]

s = "  hello world  "

print(reverseWords(s))