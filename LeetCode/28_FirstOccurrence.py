def strStr(haystack: str, needle: str) -> int:
    if not needle:
        return 0
    if needle not in haystack:
        return -1
    return haystack.index(needle)

haystack = "mississippi"
needle = "issip"

print(strStr(haystack, needle))