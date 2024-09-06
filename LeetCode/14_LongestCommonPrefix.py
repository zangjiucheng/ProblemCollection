strs = ["flower","flow","flight"]

def longestCommonPrefix(strs: list[str]) -> str:
    if not strs:
        return ""
    shortest = min(strs, key=len)
    for i, ch in enumerate(shortest):
        for other in strs:
            if other[i] != ch:
                return shortest[:i]
    return shortest

## Version 2

def longestCommonPrefix2(strs: list[str]) -> str:
        p = ""
        for cs in zip(*strs):
            if cs.count(cs[0]) < len(cs):
                break
            p += cs[0]
        return p

print(longestCommonPrefix2(strs))