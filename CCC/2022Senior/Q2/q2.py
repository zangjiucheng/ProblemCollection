n = int(input())
sameGroup = []
differentGroup = []
currentGroup = []
for i in range(n):
    sameGroup.append(input().split(" "))
n = int(input())
for i in range(n):
    differentGroup.append(input().split(" "))
n = int(input())
for i in range(n):
    currentGroup.append(input().split(" "))
count = 0


for same in sameGroup:
    for current in currentGroup:
        if same[0] in current:
            if same[1] not in current:
                count += 1
                status = False
                break
for different in differentGroup:
    for current in currentGroup:
        if different[0] in current:
            if different[1] in current:
                count += 1
                status = False
                break

print(count)
